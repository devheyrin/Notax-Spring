package com.notax.user;


import com.notax.vo.LoginVO;
import com.notax.vo.UserVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.javassist.compiler.ast.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Slf4j
@Controller
@RequiredArgsConstructor
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping ("/join")
    public String dispjoin(UserVO vo,Model model){
        model.addAttribute("vo", vo);
        return "join";
    }


    @PostMapping ("/join")
    public String execJoin(@ModelAttribute("vo") @Valid UserVO vo, Errors errors, Model model) {

        if(errors.hasErrors()) {
            // 회원가입 실패시, 입력 데이터를 유지
            model.addAttribute("vo", vo);

            // 유효성 통과 못한 필드와 메시지를 핸들링
            Map<String, String> validatorResult = userService.validateHandling(errors);
            for (String key : validatorResult.keySet()) {
                model.addAttribute(key, validatorResult.get(key));
                System.out.println("model = " + model);
            }
            return "join";
        }
            userService.save(vo);
            return "redirect:/login";
    }
    @ResponseBody
    @PostMapping ("/join-duplicate")
    public String duplicateJoin(@RequestBody String account){
        System.out.println("join");
        System.out.println("param : " + account);
        int checkNum = userService.checkId(account);
        System.out.println("checkNum : " + checkNum);
        if(checkNum == 1) {
            System.out.println("아이디가 중복되었다.");
            return "duplicated";
        }else {
            System.out.println("아이디 사용 가능");
            return "available";
        }
    }



    @GetMapping("/login")
    public String login(LoginVO loginVO,Model model,HttpSession session) {
        model.addAttribute("loginVO",loginVO);
        return "login";
    }
    @PostMapping("/login")
    public String login(@ModelAttribute("loginVO") @Valid LoginVO loginVO, HttpSession session, HttpServletRequest request,Model model, Errors errors){

        System.out.println("login");
        if(errors.hasErrors()) {
            // 로그인 실패
            model.addAttribute("loginVO", loginVO);

            // 유효성 통과 못한 필드와 메시지를 핸들링
            Map<String, String> validatorResult = userService.validateHandling(errors);
            for (String key : validatorResult.keySet()) {
                model.addAttribute(key, validatorResult.get(key));
                System.out.println("model = " + model);
            }
            return "login";
        }
       LoginVO loginMember = userService.login(loginVO);

            session = request.getSession();
            session.setAttribute("SS_userId",loginVO.getUser_id());

        log.info("session: " + session);
        log.info("loginVO : " + loginVO);

        //userService.login(loginVO);
        return "redirect:/";
    }
    @GetMapping("/logout")
    public String logout(HttpServletRequest servletRequest, HttpSession session){
        session = servletRequest.getSession();
        session.invalidate();
        return "redirect:/";
    }

}
