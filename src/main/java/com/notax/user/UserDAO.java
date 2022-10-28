package com.notax.user;

import com.notax.vo.LoginVO;
import com.notax.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDAO {
    //회원가입
    void userSave(UserVO vo);
    //로그인
    LoginVO login(LoginVO loginVO);

}
