package com.notax.user;

import com.notax.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDAO {
    //회원 등록

    int getId(UserVO VO);
    public UserVO userSave();
}
