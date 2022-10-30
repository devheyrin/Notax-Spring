package com.notax.mypage;

import com.notax.vo.MemberMdfVO;
import com.notax.vo.MembershipMdfVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public void updateMemberMdfById(MemberMdfVO memberMdfVO) {
        mypageDAO.updateMemberMdfById(memberMdfVO);
    }

    public Map<Integer, MembershipMdfVO> selectMembershipInfofindById(String memberid) {
        Map<Integer, MembershipMdfVO> resultMap = new HashMap<>();
        List<MembershipMdfVO> membershipMdfVOList = mypageDAO.selectMembershipInfofindById(memberid);
        for (MembershipMdfVO membershipMdfVO : membershipMdfVOList) {
            int dfs_no = membershipMdfVO.getDfs_no();
            resultMap.put(dfs_no, membershipMdfVO);
        }
        return resultMap;
    }
}