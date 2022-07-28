package com.leemanshow.manshowShop.common.securty;

import com.leemanshow.manshowShop.common.securty.bo.AuthUserTokenBO;

/**
 * 用户登录信息holder，此处用到了ThreadLocal，记得要在AOP中调用clean方法
 * @author leewencan
 * @date 2022/7/28 23:01
 */
public class AuthUserContext {
    private static final ThreadLocal<AuthUserTokenBO> USER_TOKEN_BO_THREAD_LOCAL = new ThreadLocal<>();

    public static AuthUserTokenBO get() {
        return USER_TOKEN_BO_THREAD_LOCAL.get();
    }

    public static void set(AuthUserTokenBO authUserTokenBO) {
        USER_TOKEN_BO_THREAD_LOCAL.set(authUserTokenBO);
    }

    public static void clean() {
        if (USER_TOKEN_BO_THREAD_LOCAL.get() != null) {
            USER_TOKEN_BO_THREAD_LOCAL.remove();
        }
    }
}
