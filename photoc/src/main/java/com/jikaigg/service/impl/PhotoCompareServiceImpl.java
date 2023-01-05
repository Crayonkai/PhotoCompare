package com.jikaigg.service.impl;

import cn.hutool.core.util.StrUtil;
import com.drew.imaging.ImageMetadataReader;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.jikaigg.domain.Photo;
import com.jikaigg.domain.PhotoCJpegDto;
import com.jikaigg.mapper.PhotoCJpegMapper;
import com.jikaigg.service.PhotoCompareService;
import com.jikaigg.utils.FileIteratorUtils;
import com.jikaigg.utils.JpegUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class PhotoCompareServiceImpl implements PhotoCompareService {

    @Autowired
    private PhotoCJpegMapper photoCJpegMapper;

    @Override
    public String savePhotoBefore(String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                log.info("目录为空");
                return "目录为空";
            }
            List<File> files = new ArrayList();
            // 获取所有文件
            FileIteratorUtils.getAllFiles(file, files);
            // 遍历文件列表获取文件属性
            for (File photoFile : files) {
                // 判断图片格式
                String type = FileIteratorUtils.convertType(photoFile);
                if (StrUtil.isBlank(type)) {
                    log.info("未获取到图片类型。");
                    return "未知图片错误";
                }
                // 获取metadata元数据
                Metadata metadata = ImageMetadataReader.readMetadata(photoFile);

                // 根据图片类型不同，获取出来的详细信息不同。分别作判断
                if ("jpg".equalsIgnoreCase(type) || "jpeg".equalsIgnoreCase(type)) {
                    PhotoCJpegDto photo = new PhotoCJpegDto();
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
                    photoCJpegMapper.insert(photo);
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
}
