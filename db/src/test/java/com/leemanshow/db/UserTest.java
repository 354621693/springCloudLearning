package com.leemanshow.db;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.leemanshow.db.entity.User;
import com.leemanshow.db.mapper.TestDataMapper;
import com.leemanshow.db.mapper.UserMapper;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
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

    @Autowired
    TestDataMapper testDataMapper;

    @Test
    public void testUser(){
        PageHelper.startPage(3,10);
        List<User> users = mapper.selectList(new QueryWrapper<User>().orderBy(true,false,"age"));
        List<User> sortedList = users.stream().sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());
        sortedList.forEach(System.out::println);
        PageInfo<User> pageInfo = new PageInfo<>(users);


        List<User> email = mapper.selectList(new QueryWrapper<User>().likeLeft("email", "354621693@qq.com"));
        List<Integer> ages = Arrays.asList(110,20);
        ages = new ArrayList<>(1);
        QueryWrapper<User> ageWrapper = new QueryWrapper<User>().in(ages.size() > 0, "age", ages);
        List<User> users1 = mapper.selectList(ageWrapper);
        users1.stream().map(v->v.getName()).forEach(System.out::println);
        email.stream().map(v -> JSON.parse(v.getEmail())).collect(Collectors.toList()).forEach(System.out::println);


    }

//    @Test
//    public void testData(){
//        Optional<TestData> byId = testDataMapper.getById(0l);
//        List<TestData> id = testDataMapper.selectList(new QueryWrapper<TestData>().eq("id", 0L));
//        List<User> users = mapper.selectList(null);
//        List<User> sortedList = users.stream().sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());
//        sortedList.forEach(System.out::println);
//    }
}
