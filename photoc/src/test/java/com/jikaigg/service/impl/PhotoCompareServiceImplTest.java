package com.jikaigg.service.impl;


import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;
import com.jikaigg.utils.FileIteratorUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
        FileInputStream file = new FileInputStream("D://githuby//PhotoCompare//pic//box.jpg");
        Metadata metadata = ImageMetadataReader.readMetadata(file);
        for (Directory directory : metadata.getDirectories()) {
            System.out.println(directory.getName());
//            System.out.println(directory);
            for (Tag tag : directory.getTags()) {
//                System.out.println("*************************");
//                System.out.println(tag);
//                System.out.println(tag.getTagName()+" : "
//                        +tag.getDescription()+" : "
//                        +tag.getDirectoryName()+" : "
//                        +tag.getTagType()+" : "
//                        +tag.getTagTypeHex());
            }
        }
    }
    @Test
    public void test3() throws FileNotFoundException {
        String path = "D://githuby//PhotoCompare//pic";
        File file = new File(path);
        List<File> list = new ArrayList<>();
        if (!file.exists()){
            System.out.println("目录为空");
            return;
        }
        System.out.println(list);
    }

    @Test
    public void test4() throws IOException {
        String path = "D://githuby//PhotoCompare//pic//box.png";
        FileInputStream file = new FileInputStream(path);
        List<File> list = new ArrayList<>();
        System.out.println(list);

        byte[] b = new byte[3];
        file.read(b, 0, b.length);
        String photo = FileIteratorUtils.bytesToHexString(b);
        photo = photo.toUpperCase();
        System.out.println("头文件是：" + photo);
        String ooo = FileIteratorUtils.checkType(photo);
        System.out.println("后缀名是：" + ooo);
    }





}
