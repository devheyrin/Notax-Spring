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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;

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
        System.out.println("join");
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
        return "login";
    }
    @GetMapping("/login")
    public String login(LoginVO loginVO,Model model) {
        model.addAttribute("loginVO",loginVO);
        return "login";
    }
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute LoginVO loginVO, BindingResult bindingResult, HttpSession session, HttpServletRequest request){
        System.out.println("login");

        if(bindingResult.hasErrors()){
            return "login";
            }
        Member loginMember = userService.login(loginVO.getUser_id(),loginVO.getUser_pwd();

        if(loginMember == null){
            bindingResult.reject("LoginFail","아이디 또는 비밀번호가 맞지 않습니다.");
            return "login";
        }
        session = request.getSession();
        session.setAttribute();

        log.info("session: " + session);
        log.info("loginVO : " + loginVO);

        userService.login(loginVO);
        return "index";
    }

}
