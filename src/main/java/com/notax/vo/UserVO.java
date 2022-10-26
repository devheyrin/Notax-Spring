package com.notax.vo;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@NoArgsConstructor
public class UserVO {
    private Long user_no;

    @NotBlank(message = "아이디는 필수 입력 값입니다.")
    private String user_id;

    @NotBlank(message = "비밀번호는 필수 입력값입니다.")
    @Pattern(regexp="(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,20}",
            message = "비밀번호는 영문 대,소문자와 숫자, 특수기호가 적어도 1개 이상씩 포함된 8자 ~ 20자의 비밀번호여야 합니다.")
    private String user_pwd;

    @NotBlank(message = "생년월일을 입력해주세요")
    private int user_birth;

    private String user_gender;

    private String user_name;

    @NotBlank(message = "이메일은 필수 입력 값입니다")
    @Email(message = "이메일 형식에 맞지 않습니다.")
    private String user_email;


    @Builder
    public UserVO(String user_id, String user_pwd, int user_birth,String user_gender, String user_name, String user_email){
        this.user_id = user_id;
        this.user_pwd = user_pwd;
        this.user_birth = user_birth;
        this.user_gender = user_gender;
        this.user_name = user_name;
        this.user_email = user_email;
    }

}
