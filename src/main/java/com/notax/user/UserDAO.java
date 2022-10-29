package com.notax.user;


import com.notax.vo.LoginVO;

import com.notax.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDAO {
    //회원가입
    //로그인
    public LoginVO login(LoginVO loginVO);

    //회원 등록

    int getId(UserVO VO);
    public void userSave(UserVO vo);

}
