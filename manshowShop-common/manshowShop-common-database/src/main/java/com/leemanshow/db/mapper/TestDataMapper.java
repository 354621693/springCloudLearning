package com.leemanshow.db.mapper;

import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.leemanshow.db.config.MyBaseMapper.MyBaseMapper;
import com.leemanshow.db.entity.TestData;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.sql.Wrapper;
import java.util.List;
import java.util.Optional;

/**
 * @author leemanshow
 */
public interface TestDataMapper extends MyBaseMapper<TestData> {

    @Select("select * from test_data")
    List<TestData> selectAll();

    @Select("select * from test_data${ew.customSqlSegment}")
    List<TestData> getByWrapper(@Param(Constants.WRAPPER) Wrapper wrapper);

    @Select("select * from test_data where id = #{ooxx}")
    Optional<TestData> getById(Long id);

    @Select("select * from test_data")
    Page<TestData> myPage(Page<TestData> page);
}
