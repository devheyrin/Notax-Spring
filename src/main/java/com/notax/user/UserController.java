package com.notax.user;


import com.notax.vo.LoginVO;
import com.notax.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping ("/join")
    public String dispjoin(){
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
    public String login() {
        return "login";
    }
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute LoginVO loginVO,  BindingResult bindingResult){
        System.out.println("login");
        if(bindingResult.hasErrors()){
            return "login";
            }
        return "join-complete";
    }

}
