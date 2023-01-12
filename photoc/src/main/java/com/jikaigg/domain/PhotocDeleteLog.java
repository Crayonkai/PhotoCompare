package com.jikaigg.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.security.DenyAll;
import java.sql.Timestamp;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhotocDeleteLog {
    private Integer id;

    private String photoMd5;

    private String pids;

    private Timestamp createTime;

    private Timestamp updateTime;

}