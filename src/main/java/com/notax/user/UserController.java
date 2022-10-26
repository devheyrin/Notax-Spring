package com.notax.user;

import com.notax.vo.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Map;

@Controller
public class UserController {
    private UserService userService;


    @GetMapping("/join")
    public String dispjoin(UserVO vo){
        return "join";
    }
    @PostMapping ("/join")
    public String execJoin(@Valid UserVO vo, Errors errors, Model model) {
        if(errors.hasErrors()){
        // 회원가입 실패시, 입력 데이터를 유지
        model.addAttribute("vo", vo);

        // 유효성 통과 못한 필드와 메시지를 핸들링
        Map<String, String> validatorResult = userService.validateHandling(errors);
        for (String key : validatorResult.keySet()) {
            model.addAttribute(key, validatorResult.get(key));
        }
        return "join";
        }
        userService.save(vo);
        return "join-complete";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }

}
