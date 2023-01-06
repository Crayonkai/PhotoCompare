package com.jikaigg.utils;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PidUtil {
    /**
     * 生成24位id
     * 规则：前16位是年月日时分秒 + 后八位是记录编号，拿0补齐8位
     *
     * @param count
     * @return
     */
    public static String SerialPid(Integer count) {
        StringBuilder sb = new StringBuilder();
        sb.append(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));
        int length = count.toString().length();
        for (int i = 0; i < 8 - length; i++) {
            sb.append("0");
        }
        sb.append(count);
        return sb.toString();
    }
}
