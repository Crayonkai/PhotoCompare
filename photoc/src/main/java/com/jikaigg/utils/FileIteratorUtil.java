package com.jikaigg.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileIteratorUtil {
    /**
     * 递归获取文件夹下文件（包含子文夹内文件）
     * @param file
     * @param fileList
     */
    public static void getAllFiles(File file, List<String> fileList) {
        for (File listFile : file.listFiles()) {
            if (listFile.isDirectory()){
                getAllFiles(listFile,fileList);
            }else {
                fileList.add(listFile.getPath());
            }
        }
    }

    /**
     * 字节数组转十六进制
     * @param src
     * @return
     */
    public static String bytesToHexString(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder();
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }

    /**
     * 文件类型映射转换
     * @param fileType 文件类型
     * @return
     */
    public static String checkType(String fileType) {
        switch (fileType) {
            case "FFD8FF": return "jpg";
            case "89504E": return "png";
            case "474946": return "jif";
            default: return "0000";
        }
    }

    /**
     * 判断文件类型
     * @return 文件真实类型
     */
    public static String convertType(String infile) throws IOException {
        FileInputStream file = new FileInputStream(infile);
        List<File> list = new ArrayList<>();
        System.out.println(list);
        byte[] b = new byte[3];
        file.read(b, 0, b.length);
        String photo = FileIteratorUtil.bytesToHexString(b);
        photo = photo.toUpperCase();
        String type = FileIteratorUtil.checkType(photo);
        return type;
    }


    /**
     * 判断文件类型
     * @return 文件真实类型
     */
    /*public static String convertType(File infile) throws IOException {
        FileInputStream file = new FileInputStream(infile);
        List<File> list = new ArrayList<>();
        System.out.println(list);
        byte[] b = new byte[3];
        file.read(b, 0, b.length);
        String photo = FileIteratorUtil.bytesToHexString(b);
        photo = photo.toUpperCase();
        String type = FileIteratorUtil.checkType(photo);
        return type;
    }*/

}
