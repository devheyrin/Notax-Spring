package com.notax.main;


import com.notax.vo.MainRankingVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class MainController {
    @Autowired
    MainService mainService;

    @RequestMapping("/")
    public String mainRank(Model model) {
        ArrayList<MainRankingVO> ranking = mainService.selectRank();
        ArrayList<MainRankingVO> pdListByDate = mainService.selectPdListByDate();
        model.addAttribute("disRank", ranking);
        model.addAttribute("pdListByDate", pdListByDate);
        return "index";
    }

}
