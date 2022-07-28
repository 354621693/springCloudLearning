package com.leemanshow.manshowShop.common.response;

import lombok.ToString;

/**
 * @author leewencan
 * @date 2022/7/28 11:22
 */
@ToString
public enum ServerResponseEnum {
    OK("0","OK"),
    SHOW_FAIL("A001","");
    private final String code;
    private final String msg;

    ServerResponseEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String value() {
        return code;
    }
    public String getMsg(){
        return msg;
    }
}
