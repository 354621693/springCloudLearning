package com.leemanshow.db.entity;

import lombok.Data;

/**
 * @author leewencan
 * @date 2022/7/22 15:50
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
