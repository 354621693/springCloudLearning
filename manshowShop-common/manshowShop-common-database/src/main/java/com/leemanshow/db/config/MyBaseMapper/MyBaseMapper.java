package com.leemanshow.db.config.MyBaseMapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author leemanshow
 */
public interface MyBaseMapper<T> extends BaseMapper<T> {
    /**
     *
     * @param entityList
     * @return
     */
    int insertBatchSomeColumn(@Param("list") List<T> entityList);

    int alwaysUpdateSomeColumnById(@Param(Constants.ENTITY) T entity);
}
