package com.jikaigg.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhotocPng {
    private Integer id;

    private String pid;

    private String ppath;

    private String photoMd5;

    private Timestamp createTime;

    private Timestamp updateTime;

    private String undefindFields;

    private String fileName;

    private String expectedFileNameExtension;

}