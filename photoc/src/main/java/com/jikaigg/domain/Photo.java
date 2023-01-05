package com.jikaigg.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Photo {
    private String id;            // 编号
    private String photoName;         // 文件名
    private Integer fileSize;         // 文件大小
    private String fileModifiedDate;  // 修改时间
    private String createTime;        // 创建时间
    private String updateTime;        // 更新时间
    private String undefindFields;    // 未声明的字段名称。
}
