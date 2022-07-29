package com.leemanshow.database;

//import com.leemanshow.db.config.DdlScript;
import com.leemanshow.database.entity.TestData;
import com.leemanshow.database.enums.TestEnum;
import com.leemanshow.database.mapper.TestDataMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DbApplicationTests {
    @Resource
    private TestDataMapper testDataMapper;
//    @Resource
//    private DdlScript ddlScript;

    @Test
    void contextLoads() {
    }
    @BeforeEach
    void truncateTable() throws Exception {
//        ddlScript.run(new StringReader("TRUNCATE TABLE test_data;"));
    }

    @Test
    @Order(1)
    void insertBatch() {
        int size = 9;
        List<TestData> testDataList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String str = i + "条";
            testDataList.add(new TestData().setTestInt(i).setTestEnum(TestEnum.TWO).setTestStr(str));
        }
        assertEquals(size, testDataMapper.insertBatchSomeColumn(testDataList));
        testDataList.forEach(System.err::println);
    }
}
