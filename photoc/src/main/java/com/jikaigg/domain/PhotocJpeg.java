package com.jikaigg.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhotocJpeg {
    private Integer id;

    private String pid;

    private String ppath;

    private String photoMd5;

    private Timestamp createTime;

    private Timestamp updateTime;

    private String undefindFields;

    private String fileName;

    private String expectedFileNameExtension;

    private String detectedFileTypeName;

    private String detectedMimeType;

    private Integer fileSize;

    private Timestamp fileModifiedDate;

    private String detectedFileTypeLongName;

    private String compressionType;

    private String dataPrecision;

    private Integer imageHeight;

    private Integer imageWidth;

    private String xResolution;

    private String yResolution;

    private Integer imageWidthIfd0;

    private Integer imageHeightIfd0;

    private String ycbcrPositioning;

    private String resolutionUnit;

    private String orientation;

    private String apertureValue;

    private String sceneType;

    private String exifVersion;

    private String exposureBiasValue;

    private String exposureProgram;

    private String colorSpace;

    private String maxApertureValue;

    private Integer exifImageHeight;

    private Integer exifImageWidth;

    private BigDecimal brightnessValue;

    private String flashpixVersion;

    private String whiteBalanceMode;

    private String exposuremode;

    private BigDecimal exposuretime;

    private String flash;

    private String fNumber;

    private Integer isoSpeedRatings;

    private String componentsConfiguration;

    private BigDecimal focalLength;

    private BigDecimal focalLength35;

    private String shutterSpeedValue;

    private String meteringMode;

    private String sceneCaptureType;

    private String whiteBalance;

    private String sensingMethod;

    private Timestamp datetimeOriginal;

    private Integer subsectimeOriginal;

    private Timestamp datetimeDigitized;

    private Integer subsectimeDigitized;

    private String interoperabilityIndex;

    private String compression;

    private String thumbnailOffset;

    private String thumbnailLength;

    private String numberOfTables;

}