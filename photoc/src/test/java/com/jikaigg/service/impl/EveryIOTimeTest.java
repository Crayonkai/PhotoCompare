package com.jikaigg.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;

public class EveryIOTimeTest {
    /**
     *
     * @throws IOException
     */
    @Test
    @Transactional
    public void test() throws IOException {
        long start = new Timestamp(System.currentTimeMillis()).getTime();
        File file = new File("D://githuby//PhotoCompare//pic//box.jpg");
        String name = file.getName();
        long end = new Timestamp(System.currentTimeMillis()).getTime();
        System.out.println(name);
        System.out.println("耗时；"+(start-end));
    }
}
