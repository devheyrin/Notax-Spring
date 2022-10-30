package com.notax.mypage;

import com.notax.vo.MemberMdfVO;
import com.notax.vo.MembershipMdfVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


@Mapper
public interface MypageDAO {
    public void updateMemberMdfById(MemberMdfVO memberMdfVO);

    public MemberMdfVO selectMemberfindById(String memberid);


    List<MembershipMdfVO> selectMembershipInfofindById(String memberid);
}