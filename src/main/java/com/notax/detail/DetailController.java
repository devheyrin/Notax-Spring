package com.notax.detail;

import com.notax.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DetailController {
    @Autowired
    DetailService detailService;
    
    @RequestMapping("/detail/{pd_no}")
    public String detail(@PathVariable("pd_no") int pd_no, Model model) {
        ProductVO productVO = detailService.selectProductById(pd_no);
        System.out.println("productVO = " + productVO);
        model.addAttribute("product", productVO);
        return "detail";
    }
}
