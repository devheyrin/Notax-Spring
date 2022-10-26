package com.notax.mypage;


import com.notax.vo.MemberMdfVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

@Controller

public class MypageController {
    @RequestMapping("/mypage")

    public String mypage() {
        return "mypage";
    }

    @RequestMapping("/update")
    public String update() {
        return "update";
    }
}

   /*@GetMapping("/mypage")
    public String Mypage(HttpSession session, Model model){
        String id= (String) session.getAttribute("user_id");
       MemberMdfVO memberMdfVO = MypageService.(id);
   }
}*/

