package com.leemanshow.database.enums;


import com.baomidou.mybatisplus.annotation.IEnum;
import lombok.Getter;

/**
 * @author leewencan
 * @date 2022/5/9 16:55
 * @author miemie
 * @since 2018-08-19
 */
@Getter
public enum TestEnum implements IEnum<Integer> {
    ONE(1, "一"),
    TWO(2, "二");

    private final int code;
    private final String val;

    TestEnum(int code, String val) {
        this.code = code;
        this.val = val;
    }

    @Override
    public Integer getValue() {
        return code;
    }
}