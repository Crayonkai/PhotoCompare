package com.jikaigg.service.impl;


import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;
import com.jikaigg.utils.FileIteratorUtil;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PhotoCompareServiceImplTest {

    @Test
    public void test1() throws IOException {
        File file = new File("D://githuby//PhotoCompare//pic//box.jpg");
        System.out.println(file.getName());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getCanonicalFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParentFile());
        System.out.println(file.getCanonicalPath());
        System.out.println(file.getFreeSpace());
        System.out.println(file.getPath());
        System.out.println(file.getTotalSpace());
        System.out.println(file.getUsableSpace());
    }

    @Test
    public void test2() throws ImageProcessingException, IOException {
//        File file = new File("D://githuby//PhotoCompare//pic//box.jpg");
        FileInputStream file = new FileInputStream("D://githuby//PhotoCompare//pic//test.png");
        Metadata metadata = ImageMetadataReader.readMetadata(file);
        for (Directory directory : metadata.getDirectories()) {
            System.out.println(directory.getName());
//            System.out.println(directory);
            for (Tag tag : directory.getTags()) {
//                System.out.println("*************************");
//                System.out.println(tag);
                System.out.println(tag.getTagName() + " : "
                        + tag.getDescription() + " : "
                        + tag.getDirectoryName() + " : "
                        + tag.getTagType() + " : "
                        + tag.getTagTypeHex());
            }
        }
    }

    @Test
    public void test3() throws FileNotFoundException {
        String path = "D://githuby//PhotoCompare//pic";
        File file = new File(path);
        List<File> list = new ArrayList<>();
        if (!file.exists()) {
            System.out.println("目录为空");
            return;
        }
        System.out.println(list);
    }

    @Test
    public void test4() throws IOException {
        String path = "D://githuby//PhotoCompare//pic//test.png";
        FileInputStream file = new FileInputStream(path);
        List<File> list = new ArrayList<>();
        System.out.println(list);

        byte[] b = new byte[3];
        file.read(b, 0, b.length);
        String photo = FileIteratorUtil.bytesToHexString(b);
        photo = photo.toUpperCase();
        System.out.println("头文件是：" + photo);
        String ooo = FileIteratorUtil.checkType(photo);
        System.out.println("后缀名是：" + ooo);
    }

    @Test
    public void test5() {
        String str = "a\\b\\vc\\d";
        System.out.println(str);
        String[] s = str.split("\\\\");
        System.out.println(s[s.length - 1]);
    }

    @Test
    public void test6() throws IOException, NoSuchAlgorithmException {
        File file = new File("D://githuby//PhotoCompare//pic//test.png");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytes = new byte[1024];
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        int length = -1;
        while ((length = fileInputStream.read(bytes, 0, 1024)) != -1) {
            md5.update(bytes, 0, length);
        }
        BigInteger bigInt = new BigInteger(1, md5.digest());
        System.out.println("文件md5值：" + bigInt.toString(16));

//        String str = "yaojikai";
//        MessageDigest md5 = MessageDigest.getInstance("MD5");
//        byte[] bytes = str.getBytes();
//        for (byte aByte : bytes) {
//            System.out.print(aByte + ",");
//        }
//        System.out.println();
//        md5.update(bytes);
//        byte[] digest = md5.digest();
//        for (byte b : digest) {
//            System.out.print(b + ",");
//        }
//        System.out.println();
//        BigInteger bigInteger = new BigInteger(1, digest);
//        System.out.println(bigInteger);
//        System.out.println(bigInteger.toString(16));

    }

    @Test
    public void test7() {
        int MAXIMUM_CAPACITY = 1 << 30;
        int cap = 253143423;
        int n = cap - 1;
        System.out.println("传入的n是：" + n + "二进制是：" + Integer.toBinaryString(n));
        n |= n >>> 1;
        System.out.println("n |= n >>> 1是：" + n + "二进制是：" + Integer.toBinaryString(n));
        n |= n >>> 2;
        System.out.println("n |= n >>> 2是：" + n + "二进制是：" + Integer.toBinaryString(n));
        n |= n >>> 4;
        System.out.println("n |= n >>> 4是：" + n + "二进制是：" + Integer.toBinaryString(n));
        n |= n >>> 8;
        System.out.println("n |= n >>> 8是：" + n + "二进制是：" + Integer.toBinaryString(n));
        n |= n >>> 16;
        System.out.println("n |= n >>> 16是：" + n + "二进制是：" + Integer.toBinaryString(n));
        int result = (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
        System.out.println(result);
    }


}
