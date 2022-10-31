package com.notax.mypage;

<<<<<<< Updated upstream

import com.notax.vo.MemberMdfVO;

import com.notax.vo.MembershipMdfVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;


/*@Slf4j*/
@Controller

public class MypageController {

    @Autowired
    MypageService mypageService;

//    @RequestMapping("/mypage")
//
//    public String mypage() {
//        return "mypage";
//    }
    //수정화면 요청
    @GetMapping("/mypage")
    public String updateform(Model model, HttpSession session) {
        // db에 있는 아이디 - 나중에 세션에서 얻어오기
        String memberid = (String) session.getAttribute("SS_userId");

        MemberMdfVO memberMdfVO = mypageService.selectMemberfindById(memberid);

        model.addAttribute("member",memberMdfVO);
        // 1. service에서 아이디와 일치하는 회원정보 조회 메소드 호출 -> vo
        // 2. vo를 받아서 model 객체에 addAttribute ("member", vo)


        // 멤버십
        // db에 있는 아이디 - 나중에 세션에서 얻어오기

        Map<Integer, MembershipMdfVO> membershipInfoMap = mypageService.selectMembershipInfofindById(memberid);
        System.out.println("membershipInfoList = " + membershipInfoMap.get(3));
        for (int i=1; i<=7; i++) {
            MembershipMdfVO membershipMdfVO = membershipInfoMap.get(i);
            model.addAttribute("dfs_no" + i, membershipMdfVO);
        }

        return "mypage";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute MemberMdfVO memberMdfVO, Model model){
        System.out.println(memberMdfVO);
        mypageService.updateMemberMdfById(memberMdfVO);
        model.addAttribute("member", memberMdfVO);
        return "redirect:mypage";
    }

    @RequestMapping("/mypage#two")
    public String membership(Model model, HttpSession session) {


        return "mypage#two";
    }


}
=======
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MypageController {

    @RequestMapping("/mypage")
    public String mypage(){
        return "mypage";
    }
}
>>>>>>> Stashed changes
