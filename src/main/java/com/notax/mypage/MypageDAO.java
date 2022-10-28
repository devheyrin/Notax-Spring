package com.notax.mypage;

import com.notax.vo.MemberMdfVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface MypageDAO {
    public void updateMemberMdfById(MemberMdfVO memberMdfVO);

    public MemberMdfVO selectMemberfindById(String memberid);


}

