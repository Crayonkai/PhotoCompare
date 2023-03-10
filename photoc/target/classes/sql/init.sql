DROP TABLE IF EXISTS `photoc_jpeg`;
#png详细信息表
CREATE TABLE `photoc_jpeg`
(
    `id`                           int          NOT NULL AUTO_INCREMENT COMMENT 'id',
    `pid`                          varchar(24)  NOT NULL COMMENT '文件编号',
    `ppath`                        varchar(260) NOT NULL COMMENT '文件绝对路径',
    `photo_md5`                    varchar(32)  NOT NULL COMMENT '图片md5',
    `create_time`                  datetime     NOT NULL COMMENT '创建时间',
    `update_time`                  datetime     NOT NULL COMMENT '更新时间',
    `undefind_fields`              varchar(500) NULL DEFAULT NULL COMMENT '未声明的字段名称',
    `file_name`                    varchar(255) NOT NULL COMMENT '文件名',
    `expected_file_name_extension` varchar(4) NULL DEFAULT NULL COMMENT '预期的文件扩展名',
    `detected_file_type_name`      varchar(4) NULL DEFAULT NULL COMMENT '检测到的文件类型',
    `detected_mime_type`           varchar(15) NULL DEFAULT NULL COMMENT ' ',
    `file_size`                    integer NULL DEFAULT NULL COMMENT '文件大小',
    `file_modified_date`           datetime NULL DEFAULT NULL COMMENT '文件修改日期',
    `detected_file_type_long_name` varchar(50) NULL DEFAULT NULL COMMENT '检测到的文件类型长名称',

    `compression_type`             varchar(20) NULL DEFAULT NULL COMMENT '压缩类型',
    `data_precision`               varchar(10) NULL DEFAULT NULL COMMENT '数据精度',
    `image_height`                 integer NULL DEFAULT NULL COMMENT '图片高度(Exif IFD0)',
    `image_width`                  integer NULL DEFAULT NULL COMMENT '图片宽度(Exif IFD0)',

    `x_resolution`                 varchar(25) NULL DEFAULT NULL COMMENT '水平分辨率',
    `y_resolution`                 varchar(25) NULL DEFAULT NULL COMMENT '垂直分辨率',
    `image_width_ifd0`             integer NULL DEFAULT NULL COMMENT '图片宽度',
    `image_height_ifd0`            integer NULL DEFAULT NULL COMMENT '图片高度',
    `ycbcr_positioning`            varchar(25) NULL DEFAULT NULL COMMENT '色度样本位置/色相定位',
    `resolution_unit`              varchar(6) NULL DEFAULT NULL COMMENT '分辨率单位',
    `orientation`                  varchar(40) NULL DEFAULT NULL COMMENT '图像数据的视觉方向',

    `aperture_value`               varchar(10) NULL DEFAULT NULL COMMENT '光圈值',
    `scene_type`                   varchar(40) NULL DEFAULT NULL COMMENT ' ',
    `exif_version`                 varchar(40) NULL DEFAULT NULL COMMENT ' ',
    `exposure_bias_value`          varchar(10) NULL DEFAULT NULL COMMENT '曝光误差',
    `exposure_program`             varchar(20) NULL DEFAULT NULL COMMENT '曝光程序',
    `color_space`                  varchar(4) NULL DEFAULT NULL COMMENT '色域/色彩空间',
    `max_aperture_value`           varchar(10) NULL DEFAULT NULL COMMENT '最大光圈',
    `exif_image_height`            integer NULL DEFAULT NULL COMMENT '图片高度(Exif SubIFD)',
    `exif_image_width`             integer NULL DEFAULT NULL COMMENT '图片宽度(Exif SubIFD)',
    `brightness_value`             decimal(5, 2) NULL DEFAULT NULL COMMENT '被拍摄对象的明度',
    `flashpix_version`             varchar(6) NULL DEFAULT NULL COMMENT '存储FlashPix 的版本信息',
    `white_balance_mode`           varchar(20) NULL DEFAULT NULL COMMENT '白平衡模式',
    `exposuremode`                 varchar(20) NULL DEFAULT NULL COMMENT '曝光模式',
    `exposuretime`                 decimal(5, 2) NULL DEFAULT NULL COMMENT '曝光时间',
    `flash`                        varchar(20) NULL DEFAULT NULL COMMENT '闪光灯使用情况',
    `f_number`                     varchar(10) NULL DEFAULT NULL COMMENT '拍照时的光圈F-number(F-stop)',
    `iso_speed_ratings`            integer NULL DEFAULT NULL COMMENT 'CCD的感光度',
    `components_configuration`     varchar(10) NULL DEFAULT NULL COMMENT '像素数据顺序',
    `focal_length`                 decimal(6, 2) NULL DEFAULT NULL COMMENT '镜头焦距长度',
    `focal_length_35`              decimal(4, 2) NULL DEFAULT NULL COMMENT ' ',
    `shutter_speed_value`          varchar(10) NULL DEFAULT NULL COMMENT '快门速度',
    `metering_mode`                varchar(25) NULL DEFAULT NULL COMMENT '曝光的测光方法',
    `scene_capture_type`           varchar(10) NULL DEFAULT NULL COMMENT ' ',
    `white_balance`                varchar(5) NULL DEFAULT NULL COMMENT '白平衡',
    `sensing_method`               varchar(20) NULL DEFAULT NULL COMMENT '图像传感器单元类型',
    `datetime_original`            datetime NULL DEFAULT NULL COMMENT '照片拍下来的日期',
    `subsectime_original`          integer NULL DEFAULT NULL COMMENT '照片拍下来的日期毫秒',
    `datetime_digitized`           datetime NULL DEFAULT NULL COMMENT '照片数字化的日期',
    `subsectime_digitized`         integer NULL DEFAULT NULL COMMENT '照片数字化的日期毫秒',

    `interoperability_index`       varchar(50) NULL DEFAULT NULL COMMENT ' ',

    `compression`                  varchar(20) NULL DEFAULT NULL COMMENT '压缩格式',
    `thumbnail_offset`             varchar(20) NULL DEFAULT NULL COMMENT ' ',
    `thumbnail_length`             varchar(20) NULL DEFAULT NULL COMMENT ' ',

    `number_of_tables`             varchar(20) NULL DEFAULT NULL COMMENT ' ',

    PRIMARY KEY (`id`)
) ENGINE = InnoDB  CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT 'jpeg详细信息表';


DROP TABLE IF EXISTS `photoc_png`;
#png详细信息表
CREATE TABLE `photoc_png`
(
    `id`                           int          NOT NULL AUTO_INCREMENT COMMENT 'id',
    `pid`                          varchar(24)  NOT NULL COMMENT '文件编号',
    `ppath`                        varchar(260) NOT NULL COMMENT '文件绝对路径',
    `photo_md5`                    varchar(32)  NOT NULL COMMENT '图片md5',
    `create_time`                  datetime     NOT NULL COMMENT '创建时间',
    `update_time`                  datetime     NOT NULL COMMENT '更新时间',
    `undefind_fields`              varchar(500) NULL DEFAULT NULL COMMENT '未声明的字段名称',
    `file_name`                    varchar(255) NOT NULL COMMENT '文件名',
    `expected_file_name_extension` varchar(4) NULL DEFAULT NULL COMMENT '预期的文件扩展名',

    PRIMARY KEY (`id`)
) ENGINE = InnoDB  CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT 'png详细信息表';

DROP TABLE IF EXISTS `photoc_delete_log`;
#重复照片记录表
CREATE TABLE `photoc_delete_log`
(
    `id`          int          NOT NULL AUTO_INCREMENT COMMENT 'id',
    `photo_md5`   varchar(32)  NOT NULL COMMENT '图片md5',
    `pids`        varchar(500) NOT NULL COMMENT '图片pid列表',
    `create_time` datetime     NOT NULL COMMENT '创建时间',
    `update_time` datetime     NOT NULL COMMENT '更新时间',

    PRIMARY KEY (`id`)
) ENGINE = InnoDB  CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT '重复照片记录表';

