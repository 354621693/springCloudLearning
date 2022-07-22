package com.leemanshow.db;

import com.leemanshow.db.entity.User;
import com.leemanshow.db.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author leewencan
 * @date 2022/7/22 15:52
 */
@SpringBootTest
public class UserTest {
    @Autowired
    private UserMapper mapper;

    @Test
    public void testUser(){
        List<User> users = mapper.selectList(null);
        List<User> sortedList = users.stream().sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }
}
