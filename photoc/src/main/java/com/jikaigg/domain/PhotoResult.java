package com.jikaigg.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhotoResult<T> {
    private Boolean success;  // 成功标志
    private String code;   // 结果错误码
    private String message;    // 处理信息
    private T data;   // 结果数据

    public PhotoResult<T> success(T data) {
        return new PhotoResult<>(true, "0000", "请求成功", data);
    }

    public static PhotoResult fail(String code, String message) {
        return new PhotoResult(false, code, message, null);
    }

}
