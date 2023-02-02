package com.jikaigg.service.impl;

import com.jikaigg.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class userServiceImplTest {
    @Autowired
    private UserUpdateService userUpdateService;
    @Autowired
    private UserDeleteService userDeleteService;
    @Test
    public void test1() {
    }
    @Test
    public void test2(){
    }

    @Test
    public void test(){
        User jikaigg = new User(1, "jikaigg", 99);
        userUpdateService.update(jikaigg);
    }

    @Test
    public void test4(){
        userDeleteService.delete(2);
    }

    @Test
    public void test5(){

    }

    @Test
    public void test6(){

    }

    @Test
    public void test7(){

    }
}
