package com.jikaigg.domain;


import cn.hutool.core.date.DateUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhotoCJpegDto {
    // 基础字段
    private String id;                // 编号
    private String pid;               // 文件编号
    private String ppath;             // 文件绝对路径
    private Timestamp createTime;     // 创建时间
    private Timestamp updateTime;     // 更新时间
    private String undefindFields;    // 未声明的字段名称，用顿号隔开

    // File Type块
    private String fileName;                  // 文件名
    private String expectedFileNameExtension; // 预期的文件扩展名
    private String detectedFileTypeName;      // 检测到的文件类型
    private String detectedMIMEType;          //
    private Integer fileSize;                  // 文件大小，单位为bytes
    private Timestamp fileModifiedDate;          // 文件修改日期
    private String detectedFileTypeLongName;  // 检测到的文件类型长名称

    // JPEG块
    private String compressionType;   // 压缩类型
    private String dataPrecision;     // 数据精度
    private String imageHeight;       // 图片高度
    private String imageWidth;        // 图片宽度

    // Exif IFD0块
    private String xResolution;       // 水平分辨率
    private String yResolution;       // 垂直分辨率
    private Integer imageWidthIFD0;    // 图片宽度
    private Integer imageHeightIFD0;   // 图片高度
    private String yCbCrPositioning;  // 色度样本位置（色相定位）
    private String resolutionUnit;    // 分辨率单位
    private String orientation;       // 图像数据的视觉方向

    // Exif SubIFD块
    private String apertureValue;           // 光圈值
    private String sceneType;               //
    private String exifVersion;             //
    private String exposureBiasValue;       // 曝光误差
    private String exposureProgram;         // 曝光程序
    private String colorSpace;              // 色域/色彩空间
    private String maxApertureValue;        // 最大光圈
    private Integer exifImageHeight;        //
    private Integer exifImageWidth;         //
    private BigDecimal brightnessValue;     // 被拍摄对象的明度
    private BigDecimal flashPixVersion;         // 存储FlashPix 的版本信息
    private String whiteBalanceMode;        // 白平衡模式
    private String exposureMode;            // 曝光模式
    private BigDecimal exposureTime;        // 曝光时间
    private String flash;                   // '0' 表示闪光灯没有闪光, '1' 表示闪光灯闪光, '5' 表示闪光但没有检测反射光, '7' 表示闪光且检测了反射光.
    private String fNumber;                 // 拍照时的光圈F-number(F-stop)
    private Integer iSOSpeedRatings;        // CCD的感光度
    private String componentsConfiguration; // 像素数据顺序
    private Integer focalLength;            // 镜头焦距长度
    private Integer focalLength35;          //
    private String shutterSpeedValue;       // 快门速度
    private String meteringMode;            // 曝光的测光方法
    private String sceneCaptureType;        //
    private String whiteBalance;            // 白平衡
    private String sensingMethod;           // 图像传感器单元类型
    private Timestamp dateTimeOriginal;     // 照片再被拍下来的日期时间
    private Integer subSecTimeOriginal;     // Sub-Sec Time Original 照片在被拍下的日期时间的微妙
    private Timestamp dateTimeDigitized;    // 照片在被数字化的日期/时间
    private Integer subSecTimeDigitized;    // 照片在被数字化的日期/时间的微妙

    // Interoperability块
    private String interoperabilityIndex;         //

    // Exif Thumbnail块
    private String compression;     // 压缩格式
    private String thumbnailOffset;     //
    private String thumbnailLength;     //

    // Huffman 块
    private String numberOfTables;  //

}
