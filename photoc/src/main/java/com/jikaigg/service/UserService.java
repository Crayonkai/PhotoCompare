package com.jikaigg.service;

import com.jikaigg.domain.User;

import java.util.List;

public interface UserService {

    public Integer deleteById(Integer id);

    public Integer updateById(User user);
}
