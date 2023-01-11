package com.jikaigg.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhotoVo {
    private String pid;
    private String ppath;
    private String photomd5;
    private String updatetime;
    private String filename;
    private String filesize;
}
