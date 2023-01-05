package com.jikaigg.utils;

import com.drew.metadata.Directory;
import com.drew.metadata.Tag;
import com.jikaigg.domain.PhotoCJpegDto;

public class JpegUtil {

    /**
     * jpeg块字段映射赋值
     *
     * @param directory
     * @param photo
     * @return
     */
    public static PhotoCJpegDto covertJpeg(Directory directory, PhotoCJpegDto photo) {
        for (Tag tag : directory.getTags()) {
            if ("Compression Type".equalsIgnoreCase(tag.getTagName())) {
                // Compression Type 压缩类型
                photo.setCompressionType(tag.getDescription());
            } else if ("Data Precision".equalsIgnoreCase(tag.getTagName())) {
                // Data Precision 数据精度
                photo.setDataPrecision(tag.getDescription());
            } else if ("Image Height".equalsIgnoreCase(tag.getTagName())) {
                // Image Height 图片高度
                photo.setImageHeight(tag.getDescription());
            } else if ("Image Width".equalsIgnoreCase(tag.getTagName())) {
                // Image Width 图片宽度
                photo.setImageWidth(tag.getDescription());
            } else {
                // 未定义字段收集
                photo.setUndefindFields(photo.getUndefindFields() + tag.getTagName() + "、");
            }
        }
        return photo;
    }

    /**
     * Exif IFD0块字段映射赋值
     *
     * @param directory
     * @param photo
     * @return
     */
    public static PhotoCJpegDto covertExifIFD0(Directory directory, PhotoCJpegDto photo) {
        for (Tag tag : directory.getTags()) {
            if ("Y Resolution".equalsIgnoreCase(tag.getTagName())) {
                // Y Resolution 垂直分辨率
                photo.setYResolution(tag.getDescription());
            } else if ("X Resolution".equalsIgnoreCase(tag.getTagName())) {
                // X Resolution 水平分辨率
                photo.setXResolution(tag.getDescription());
            } else if ("Image Width".equalsIgnoreCase(tag.getTagName())) {
                // Image Width 图片宽度
                photo.setImageWidthIFD0(tag.getDescription());
            } else if ("Image Height".equalsIgnoreCase(tag.getTagName())) {
                // Image Height 图片高度
                photo.setImageHeightIFD0(tag.getDescription());
            } else if ("YCbCr Positioning".equalsIgnoreCase(tag.getTagName())) {
                // YCbCr Positioning 色度样本位置（色相定位）
                photo.setYCbCrPositioning(tag.getDescription());
            } else if ("Resolution Unit".equalsIgnoreCase(tag.getTagName())) {
                // Resolution Unit 分辨率单位
                photo.setResolutionUnit(tag.getDescription());
            } else if ("Orientation".equalsIgnoreCase(tag.getTagName())) {
                // Orientation 图像数据的视觉方向
                photo.setOrientation(tag.getDescription());
            } else {
                // 未定义字段收集
                photo.setUndefindFields(photo.getUndefindFields() + tag.getTagName() + "、");
            }
        }
        return photo;
    }

    /**
     * Exif SubIFD块字段映射赋值
     *
     * @param directory
     * @param photo
     * @return
     */
    public static PhotoCJpegDto covertExifSubIFD(Directory directory, PhotoCJpegDto photo) {
        for (Tag tag : directory.getTags()) {
            if ("Aperture Value".equalsIgnoreCase(tag.getTagName())) {
                // Aperture Value 光圈值
                photo.setApertureValue(tag.getDescription());
            } else if ("Scene Type".equalsIgnoreCase(tag.getTagName())) {
                // Scene Type
                photo.setSceneType(tag.getDescription());
            } else if ("Exif Version".equalsIgnoreCase(tag.getTagName())) {
                // Exif Version
                photo.setExifVersion(tag.getDescription());
            } else if ("Exposure Bias Value".equalsIgnoreCase(tag.getTagName())) {
                // Exposure Bias Value 曝光误差
                photo.setExposureBiasValue(tag.getDescription());
            } else if ("Exposure Program".equalsIgnoreCase(tag.getTagName())) {
                // Exposure Program 曝光程序
                photo.setExposureProgram(tag.getDescription());
            } else if ("Color Space".equalsIgnoreCase(tag.getTagName())) {
                // Color Space 色域/色彩空间
                photo.setColorSpace(tag.getDescription());
            } else if ("Max Aperture Value".equalsIgnoreCase(tag.getTagName())) {
                // Max Aperture Value 最大光圈
                photo.setMaxApertureValue(tag.getDescription());
            } else if ("Exif Image Height".equalsIgnoreCase(tag.getTagName())) {
                // Exif Image Height
                photo.setExifImageHeight(tag.getDescription());
            } else {
                // 未定义字段收集
                photo.setUndefindFields(photo.getUndefindFields() + tag.getTagName() + "、");
            }
        }
        return photo;
    }

    /**
     * Interoperability块字段映射赋值
     *
     * @param directory
     * @param photo
     * @return
     */
    public static PhotoCJpegDto covertInteroperability(Directory directory, PhotoCJpegDto photo) {
        for (Tag tag : directory.getTags()) {
            if ("".equalsIgnoreCase(tag.getTagName())) {

            } else if ("".equalsIgnoreCase(tag.getTagName())) {
            } else if ("".equalsIgnoreCase(tag.getTagName())) {
            } else if ("".equalsIgnoreCase(tag.getTagName())) {
            } else if ("".equalsIgnoreCase(tag.getTagName())) {
            } else if ("".equalsIgnoreCase(tag.getTagName())) {
            } else if ("".equalsIgnoreCase(tag.getTagName())) {
            } else if ("".equalsIgnoreCase(tag.getTagName())) {
            } else {
                // 未定义字段收集
                photo.setUndefindFields(photo.getUndefindFields() + tag.getTagName() + "、");
            }
        }
        return photo;
    }

    /**
     * Exif Thumbnail块字段映射赋值
     *
     * @param directory
     * @param photo
     * @return
     */
    public static PhotoCJpegDto covertExifThumbnail(Directory directory, PhotoCJpegDto photo) {
        for (Tag tag : directory.getTags()) {
            if ("".equalsIgnoreCase(tag.getTagName())) {

            } else if ("".equalsIgnoreCase(tag.getTagName())) {
            } else if ("".equalsIgnoreCase(tag.getTagName())) {
            } else if ("".equalsIgnoreCase(tag.getTagName())) {
            } else if ("".equalsIgnoreCase(tag.getTagName())) {
            } else if ("".equalsIgnoreCase(tag.getTagName())) {
            } else if ("".equalsIgnoreCase(tag.getTagName())) {
            } else if ("".equalsIgnoreCase(tag.getTagName())) {
            } else {
                // 未定义字段收集
                photo.setUndefindFields(photo.getUndefindFields() + tag.getTagName() + "、");
            }
        }
        return photo;
    }

    /**
     * Huffman块字段映射赋值
     *
     * @param directory
     * @param photo
     * @return
     */
    public static PhotoCJpegDto covertHuffman(Directory directory, PhotoCJpegDto photo) {
        for (Tag tag : directory.getTags()) {
            if ("".equalsIgnoreCase(tag.getTagName())) {

            } else if ("".equalsIgnoreCase(tag.getTagName())) {
            } else if ("".equalsIgnoreCase(tag.getTagName())) {
            } else if ("".equalsIgnoreCase(tag.getTagName())) {
            } else if ("".equalsIgnoreCase(tag.getTagName())) {
            } else if ("".equalsIgnoreCase(tag.getTagName())) {
            } else if ("".equalsIgnoreCase(tag.getTagName())) {
            } else if ("".equalsIgnoreCase(tag.getTagName())) {
            } else {
                // 未定义字段收集
                photo.setUndefindFields(photo.getUndefindFields() + tag.getTagName() + "、");
            }
        }
        return photo;
    }

    /**
     * File Type块字段映射赋值
     *
     * @param directory
     * @param photo
     * @return
     */
    public static PhotoCJpegDto covertFileType(Directory directory, PhotoCJpegDto photo) {
        for (Tag tag : directory.getTags()) {
            if ("".equalsIgnoreCase(tag.getTagName())) {

            } else if ("".equalsIgnoreCase(tag.getTagName())) {
            } else if ("".equalsIgnoreCase(tag.getTagName())) {
            } else if ("".equalsIgnoreCase(tag.getTagName())) {
            } else if ("".equalsIgnoreCase(tag.getTagName())) {
            } else if ("".equalsIgnoreCase(tag.getTagName())) {
            } else if ("".equalsIgnoreCase(tag.getTagName())) {
            } else if ("".equalsIgnoreCase(tag.getTagName())) {
            } else {
                // 未定义字段收集
                photo.setUndefindFields(photo.getUndefindFields() + tag.getTagName() + "、");
            }
        }
        return photo;
    }


}
