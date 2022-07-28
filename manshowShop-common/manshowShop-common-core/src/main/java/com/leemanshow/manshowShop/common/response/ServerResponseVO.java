package com.leemanshow.manshowShop.common.response;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * @author leewencan
 * @date 2022/7/28 11:20
 */
@Slf4j
@Data
public class ServerResponseVO<T> implements Serializable {
    private String code;
    private String msg;
    private T data;

    public static <T> ServerResponseVO<T> success(T data) {
        ServerResponseVO<T> result = new ServerResponseVO<>();
        result.setCode(ServerResponseEnum.OK.value());
        result.setMsg(ServerResponseEnum.OK.getMsg());
        result.setData(data);
        return result;
    }

    public static <T> ServerResponseVO<T> success() {
        ServerResponseVO<T> result = new ServerResponseVO<>();
        result.setCode(ServerResponseEnum.OK.value());
        result.setMsg(ServerResponseEnum.OK.getMsg());
        return result;
    }

    public static <T> ServerResponseVO<T> showFail(String msg) {
        ServerResponseVO<T> result = new ServerResponseVO<>();
        result.setCode(ServerResponseEnum.SHOW_FAIL.value());
        result.setMsg(msg);
        return result;
    }
}
