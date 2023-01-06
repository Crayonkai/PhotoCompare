package com.jikaigg.utils;

import cn.hutool.core.util.StrUtil;
import com.drew.metadata.Directory;
import com.drew.metadata.Tag;
import com.jikaigg.domain.PhotocJpeg;
import com.jikaigg.domain.PhotocJpeg;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JpegUtil {

    /**
     * jpeg块字段映射赋值
     *
     * @param directory
     * @param photo
     * @return
     */
    public static PhotocJpeg covertJpeg(Directory directory, PhotocJpeg photo) {
        for (Tag tag : directory.getTags()) {
            if ("Compression Type".equalsIgnoreCase(tag.getTagName())) {
                // Compression Type 压缩类型
                photo.setCompressionType(tag.getDescription());
            } else if ("Data Precision".equalsIgnoreCase(tag.getTagName())) {
                // Data Precision 数据精度
                photo.setDataPrecision(tag.getDescription());
            } else if ("Image Height".equalsIgnoreCase(tag.getTagName())) {
                // Image Height 图片高度
                String description = tag.getDescription();
                if (StrUtil.isNotBlank(description)) {
                    String[] split = description.split(" ");
                    Integer integer = Integer.valueOf(split[0]);
                    photo.setImageHeight(integer);
                }
            } else if ("Image Width".equalsIgnoreCase(tag.getTagName())) {
                // Image Width 图片宽度
                String description = tag.getDescription();
                if (StrUtil.isNotBlank(description)) {
                    String[] split = description.split(" ");
                    Integer integer = Integer.valueOf(split[0]);
                    photo.setImageWidth(integer);
                }
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
    public static PhotocJpeg covertExifIFD0(Directory directory, PhotocJpeg photo) {
        for (Tag tag : directory.getTags()) {
            if ("Y Resolution".equalsIgnoreCase(tag.getTagName())) {
                // Y Resolution 垂直分辨率
                photo.setYResolution(tag.getDescription());
            } else if ("X Resolution".equalsIgnoreCase(tag.getTagName())) {
                // X Resolution 水平分辨率
                photo.setXResolution(tag.getDescription());
            } else if ("Image Width".equalsIgnoreCase(tag.getTagName())) {
                // Image Width 图片宽度
                String description = tag.getDescription();
                if (StrUtil.isNotBlank(description)) {
                    String[] split = description.split(" ");
                    Integer integer = Integer.valueOf(split[0]);
                    photo.setImageWidthIfd0(integer);
                }
            } else if ("Image Height".equalsIgnoreCase(tag.getTagName())) {
                // Image Height 图片高度
                String description = tag.getDescription();
                if (StrUtil.isNotBlank(description)) {
                    String[] split = description.split(" ");
                    Integer integer = Integer.valueOf(split[0]);
                    photo.setImageHeightIfd0(integer);
                }
            } else if ("YCbCr Positioning".equalsIgnoreCase(tag.getTagName())) {
                // YCbCr Positioning 色度样本位置（色相定位）
                photo.setYcbcrPositioning(tag.getDescription());
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
    public static PhotocJpeg covertExifSubIFD(Directory directory, PhotocJpeg photo) throws ParseException {
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
                String description = tag.getDescription();
                if (StrUtil.isNotBlank(description)) {
                    String[] split = description.split(" ");
                    Integer integer = Integer.valueOf(split[0]);
                    photo.setExifImageHeight(integer);
                }
            } else if ("Brightness Value".equalsIgnoreCase(tag.getTagName())) {
                // Brightness Value 被拍摄对象的明度
                BigDecimal bigDecimal = new BigDecimal(tag.getDescription());
                photo.setBrightnessValue(bigDecimal);
            } else if ("Date/Time Original".equalsIgnoreCase(tag.getTagName())) {
                // Date/Time Original 照片在被拍下来的日期时间
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
                Date parse = simpleDateFormat.parse(tag.getDescription());
                photo.setDatetimeOriginal(new Timestamp(parse.getTime()));
            } else if ("FlashPix Version".equalsIgnoreCase(tag.getTagName())) {
                // FlashPix Version 存储FlashPix 的版本信息
                photo.setFlashpixVersion(tag.getDescription());
            } else if ("Sub-Sec Time Original".equalsIgnoreCase(tag.getTagName())) {
                // Sub-Sec Time Original 照片在被拍下的日期时间的毫秒
                String description = tag.getDescription();
                if (StrUtil.isNotBlank(description)) {
                    Integer integer = Integer.valueOf(description);
                    photo.setSubsectimeOriginal(integer);
                }
            } else if ("White Balance Mode".equalsIgnoreCase(tag.getTagName())) {
                // White Balance Mode 白平衡模式
                photo.setWhiteBalanceMode(tag.getDescription());
            } else if ("Exposure Mode".equalsIgnoreCase(tag.getTagName())) {
                // Exposure Mode 曝光模式
                photo.setExposuremode(tag.getDescription());
            } else if ("Flash".equalsIgnoreCase(tag.getTagName())) {
                // Flash '0' 表示闪光灯没有闪光, '1' 表示闪光灯闪光, '5' 表示闪光但没有检测反射光, '7' 表示闪光且检测了反射光.
                photo.setFlash(tag.getDescription());
            } else if ("F-Number".equalsIgnoreCase(tag.getTagName())) {
                // F-Number 拍照时的光圈F-number(F-stop)
                photo.setFNumber(tag.getDescription());
            } else if ("Exif Image Width".equalsIgnoreCase(tag.getTagName())) {
                // Exif Image Width
                String description = tag.getDescription();
                if (StrUtil.isNotBlank(description)) {
                    String[] split = description.split(" ");
                    Integer integer = Integer.valueOf(split[0]);
                    photo.setExifImageWidth(integer);
                }
            } else if ("ISO Speed Ratings".equalsIgnoreCase(tag.getTagName())) {
                // ISO Speed Ratings
                String description = tag.getDescription();
                if (StrUtil.isNotBlank(description)) {
                    String[] split = description.split(" ");
                    Integer integer = Integer.valueOf(split[0]);
                    photo.setIsoSpeedRatings(integer);
                }
            } else if ("Components Configuration".equalsIgnoreCase(tag.getTagName())) {
                // Components Configuration
                photo.setComponentsConfiguration(tag.getDescription());
            } else if ("Focal Length".equalsIgnoreCase(tag.getTagName())) {
                // Focal Length
                String description = tag.getDescription();
                if (StrUtil.isNotBlank(description)) {
                    String[] split = description.split(" ");
                    BigDecimal bigDecimal = new BigDecimal(split[0]);
                    photo.setFocalLength(bigDecimal);
                }
            } else if ("Focal Length 35".equalsIgnoreCase(tag.getTagName())) {
                // Focal Length 35
                String description = tag.getDescription();
                if (StrUtil.isNotBlank(description)) {
                    String[] split = description.split(" ");
                    BigDecimal bigDecimal = new BigDecimal(split[0]);
                    photo.setFocalLength35(bigDecimal);
                }
            } else if ("Sub-Sec Time Digitized".equalsIgnoreCase(tag.getTagName())) {
                // Sub-Sec Time Digitized 照片被数字化的日期时间的微秒
                String description = tag.getDescription();
                if (StrUtil.isNotBlank(description)) {
                    Integer integer = Integer.valueOf(description);
                    photo.setSubsectimeDigitized(integer);
                }
            } else if ("Date/Time Digitized".equalsIgnoreCase(tag.getTagName())) {
                // Date/Time Digitized 照片被数字化的日期时间
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
                Date parse = simpleDateFormat.parse(tag.getDescription());
                photo.setDatetimeDigitized(new Timestamp(parse.getTime()));
            } else if ("Shutter Speed Value".equalsIgnoreCase(tag.getTagName())) {
                // Shutter Speed Value
                photo.setShutterSpeedValue(tag.getDescription());
            } else if ("Metering Mode".equalsIgnoreCase(tag.getTagName())) {
                // Metering Mode
                photo.setMeteringMode(tag.getDescription());
            } else if ("Scene Capture Type".equalsIgnoreCase(tag.getTagName())) {
                // Scene Capture Type
                photo.setSceneCaptureType(tag.getDescription());
            } else if ("White Balance".equalsIgnoreCase(tag.getTagName())) {
                // White Balance 白平衡
                photo.setWhiteBalance(tag.getDescription());
            } else if ("Sensing Method".equalsIgnoreCase(tag.getTagName())) {
                // Sensing Method
                photo.setSensingMethod(tag.getDescription());
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
    public static PhotocJpeg covertInteroperability(Directory directory, PhotocJpeg photo) {
        for (Tag tag : directory.getTags()) {
            if ("Interoperability Index".equalsIgnoreCase(tag.getTagName())) {
                // Interoperability Index
                photo.setInteroperabilityIndex(tag.getDescription());
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
    public static PhotocJpeg covertExifThumbnail(Directory directory, PhotocJpeg photo) {
        for (Tag tag : directory.getTags()) {
            if ("Compression".equalsIgnoreCase(tag.getTagName())) {
                // Compression
                photo.setCompression(tag.getDescription());
            } else if ("Thumbnail Offset".equalsIgnoreCase(tag.getTagName())) {
                // Thumbnail Offset
                photo.setThumbnailOffset(tag.getDescription());
            } else if ("Thumbnail Length".equalsIgnoreCase(tag.getTagName())) {
                // Thumbnail Length
                photo.setThumbnailLength(tag.getDescription());
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
    public static PhotocJpeg covertHuffman(Directory directory, PhotocJpeg photo) {
        for (Tag tag : directory.getTags()) {
            if ("Number of Tables".equalsIgnoreCase(tag.getTagName())) {
                // Number of Tables
                photo.setNumberOfTables(tag.getDescription());
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
    public static PhotocJpeg covertFileType(Directory directory, PhotocJpeg photo) {
        for (Tag tag : directory.getTags()) {
            if ("Detected File Type Name".equalsIgnoreCase(tag.getTagName())) {
                // Detected File Type Name
                photo.setDetectedFileTypeName(tag.getDescription());
            } else if ("Detected File Type Long Name".equalsIgnoreCase(tag.getTagName())) {
                // Detected File Type Long Name
                photo.setDetectedFileTypeLongName(tag.getDescription());
            } else if ("Detected MIME Type".equalsIgnoreCase(tag.getTagName())) {
                // Detected MIME Type
                photo.setDetectedMimeType(tag.getDescription());
            } else if ("Expected File Name Extension".equalsIgnoreCase(tag.getTagName())) {
                // Expected File Name Extension
                photo.setExpectedFileNameExtension(tag.getDescription());
            } else if ("File Size".equalsIgnoreCase(tag.getTagName())) {
                // File Size
                String description = tag.getDescription();
                if (StrUtil.isNotBlank(description)) {
                    String[] split = description.split(" ");
                    Integer integer = Integer.valueOf(split[0]);
                    photo.setFileSize(integer);
                }
            } else if ("File Modified Date".equalsIgnoreCase(tag.getTagName())) {
                // File Modified Date
                photo.setFileModifiedDate(null);
            } else {
                // 未定义字段收集
                photo.setUndefindFields(photo.getUndefindFields() + tag.getTagName() + "、");
            }
        }
        return photo;
    }

}
