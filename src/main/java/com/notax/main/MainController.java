package com.notax.main;


import com.notax.vo.MainRankingVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @Autowired
    MainService mainService;

    @RequestMapping("/mainRank")
    public String mainRank() {
        MainRankingVO mainRankingVO = mainService.selectRank();
        System.out.println("MainRankingVO = " + mainRankingVO);
        return "mainRank";
    }

}
