package com.jikaigg.service.impl;

import cn.hutool.core.util.StrUtil;
import com.drew.imaging.ImageMetadataReader;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.jikaigg.domain.PhotocJpeg;
import com.jikaigg.mapper.PhotocJpegMapper;
import com.jikaigg.service.PhotoCompareService;
import com.jikaigg.utils.FileIteratorUtil;
import com.jikaigg.utils.JpegUtil;
import com.jikaigg.utils.PidUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class PhotoCompareServiceImpl implements PhotoCompareService {

    @Autowired
    private PhotocJpegMapper photocJpegMapper;

    @Override
    public String savePhotoBefore(String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                log.info("目录为空");
                return "目录为空";
            }
            List<String> files = new ArrayList();
            // 获取所有文件
            FileIteratorUtil.getAllFiles(file, files);
            log.info("共发现 {} 张图片" ,files.size());
            int count = 0;
            // 遍历文件列表获取文件属性
            for (String photoFile : files) {
                count++;
                // 判断图片格式
                String type = FileIteratorUtil.convertType(photoFile);
                if (StrUtil.isBlank(type)) {
                    log.info("未获取到图片类型。");
                    return "未知图片错误";
                }
                // 获取metadata元数据
                Metadata metadata = ImageMetadataReader.readMetadata(new File(photoFile));

                // 根据图片类型不同，获取出来的详细信息不同。分别作判断
                if ("jpg".equalsIgnoreCase(type) || "jpeg".equalsIgnoreCase(type)) {
                    PhotocJpeg photo = new PhotocJpeg();
                    photo.setPid(PidUtil.SerialPid(count));
                    photo.setCreateTime(new Timestamp(System.currentTimeMillis()));
                    photo.setUpdateTime(new Timestamp(System.currentTimeMillis()));
                    photo.setPpath(photoFile);
                    String[] split = photoFile.split("\\\\");
                    photo.setFileName(split[split.length - 1]);
                    // 分块赋值，比较清晰
                    for (Directory directory : metadata.getDirectories()) {
                        if ("jpg".equalsIgnoreCase(directory.getName()) || "jpeg".equalsIgnoreCase(directory.getName())) {
                            // jpeg块，主要属性看covertJpeg注释
                            JpegUtil.covertJpeg(directory, photo);
                        } else if ("Exif IFD0".equalsIgnoreCase(directory.getName())) {
                            // Exif IFD0块，主要属性看covertExifIFD0注释
                            JpegUtil.covertExifIFD0(directory, photo);
                        } else if ("Exif SubIFD".equalsIgnoreCase(directory.getName())) {
                            // Exif SubIFD块，主要属性看covertExifSubIFD注释
                            JpegUtil.covertExifSubIFD(directory, photo);
                        } else if ("Interoperability".equalsIgnoreCase(directory.getName())) {
                            // Interoperability块，主要属性看covertInteroperability注释
                            JpegUtil.covertInteroperability(directory, photo);
                        } else if ("Exif Thumbnail".equalsIgnoreCase(directory.getName())) {
                            // Exif Thumbnail块，主要属性看covertExifThumbnail注释
                            JpegUtil.covertExifThumbnail(directory, photo);
                        } else if ("Huffman".equalsIgnoreCase(directory.getName())) {
                            // Huffman块，主要属性看covertHuffman注释
                            JpegUtil.covertHuffman(directory, photo);
                        } else if ("File Type".equalsIgnoreCase(directory.getName())) {
                            // File Type块，covertFileType
                            JpegUtil.covertFileType(directory, photo);
                        } else {
                            log.info("不存在该文件块：{}", directory.getName());
                        }
                    }
                    String photomd5 = DigestUtils.md5DigestAsHex(new FileInputStream(photoFile));
                    photo.setPhotoMd5(photomd5);
                    log.info("新增jpeg数据：{}", photo.toString());
                    photocJpegMapper.insertSelective(photo);
                } else if ("png".equalsIgnoreCase(type)) {
                    // TODO
                } else if ("bmp".equalsIgnoreCase(type)) {
                    // TODO
                } else {
                    // TODO
                }

            }
            return "处理成功";
        } catch (Exception e) {
            throw new RuntimeException("处理错误", e);
        }

    }

    /**
     * 根据pid查询一张图片
     * @param pid
     * @return
     */
    @Override
    public String getByPId(String pid) {
        Map<String , Object> photoc = photocJpegMapper.selectByPId(pid);
        return null;
    }


}
