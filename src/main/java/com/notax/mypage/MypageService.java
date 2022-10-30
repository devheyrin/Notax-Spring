package com.notax.mypage;

import com.notax.vo.MemberMdfVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*@Slf4j*/
@Service
public class MypageService {


    @Autowired
    MypageDAO mypageDAO;


    public void update(MemberMdfVO memberMdfVO){
        mypageDAO.updateMemberMdfById(memberMdfVO);
    }

    public MemberMdfVO selectMemberfindById(String memberid){

        mypageDAO.selectMemberfindById(memberid);
        return mypageDAO.selectMemberfindById(memberid);

    }
}


