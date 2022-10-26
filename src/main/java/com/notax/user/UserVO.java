package com.notax.user;

import lombok.Data;

@Data
public class UserVO {
    private Long user_no;
    private String user_id;
    private String user_pwd;
    private int user_birth;
    private String user_gender;
    private String user_name;
    private String user_email;
}
