package com.notax.mypage;


import com.notax.vo.MemberMdfVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/*@Slf4j*/
@Controller

public class MypageController {

    @Autowired
    MypageDAO mypageDAO;

    @RequestMapping("/mypage")

    public String mypage() {
        return "mypage";
    }
    //수정화면 요청
    @GetMapping("/update")
    public String updateform(Model model) {
        // db에 있는 아이디 - 나중에 세션에서 얻어오기


        String memberid = "first";

        MemberMdfVO memberMdfVO= mypageDAO.selectMemberfindById(memberid);



        model.addAttribute("memberid",memberMdfVO);



        // 1. service에서 아이디와 일치하는 회원정보 조회 메소드 호출 -> vo
        // 2. vo를 받아서 model 객체에 addAttribute ("member", vo)
        return "update";
    }



    @PostMapping("/update")
    public String update(@ModelAttribute MemberMdfVO memberMdfVO, Model model){
        System.out.println(memberMdfVO);
        mypageDAO.updateMemberMdfById(memberMdfVO);
        model.addAttribute("member", memberMdfVO);
        return "mypage";
    }

}


