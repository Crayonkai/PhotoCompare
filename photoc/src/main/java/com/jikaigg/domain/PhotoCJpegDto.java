package com.jikaigg.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhotoCJpegDto {
    // 基础字段
    private String id;                // 编号
    private String pid;               // 文件编号
    private String createTime;        // 创建时间
    private String updateTime;        // 更新时间
    private String undefindFields;    // 未声明的字段名称，用顿号隔开

    // JPEG块
    private String compressionType;   // 压缩类型
    private String dataPrecision;     // 数据精度
    private String imageHeight;       // 图片高度
    private String imageWidth;        // 图片宽度

    // Exif IFD0块
    private String yResolution;       // 垂直分辨率
    private String xResolution;       // 水平分辨率
    private String imageWidthIFD0;    // 图片宽度
    private String imageHeightIFD0;    // 图片高度
    private String yCbCrPositioning;   // 色度样本位置（色相定位）
    private String resolutionUnit;     // 分辨率单位
    private String orientation;        // 图像数据的视觉方向

    // Exif SubIFD块
    private String apertureValue;     // 光圈值
    private String sceneType;     //
    private String exifVersion;     //
    private String exposureBiasValue;     // 曝光误差
    private String exposureProgram;     //曝光程序
    private String colorSpace;     // 色域/色彩空间
    private String maxApertureValue;     // 最大光圈
    private String exifImageHeight;     //
    private String ;     //
    private String ;     //
    private String ;     //
    private String ;     //






    private String photoName;         // 文件名
    private Integer fileSize;         // 文件大小
    private String fileModifiedDate;  // 修改时间

}
