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
      /*  log.info(this.getClass().getName() + ".MyPageService START!!!");*/

        /*log.info("mypageDAO.selectMemberfindById(memberid)" + */
        mypageDAO.selectMemberfindById(memberid);

       /* log.info(this.getClass().getName() + ".MyPageService END!!!");*/

        return mypageDAO.selectMemberfindById(memberid);

    }
}


