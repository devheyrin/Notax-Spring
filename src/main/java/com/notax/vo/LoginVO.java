package com.notax.vo;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class LoginVO {
    @NotBlank(message = "아이디는 필수 입력 값입니다.")
    private String user_id;

    @NotBlank(message = "비밀번호는 필수 입력값입니다.")
    @Pattern(regexp="(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,20}",
            message = "비밀번호는 영문 대,소문자와 숫자, 특수기호가 적어도 1개 이상씩 포함된 8자 ~ 20자의 비밀번호여야 합니다.")
    private String user_pwd;

    @Builder
    public LoginVO(String user_id, String user_pwd) {
        this.user_id = user_id;
        this.user_pwd = user_pwd;
    }
}
