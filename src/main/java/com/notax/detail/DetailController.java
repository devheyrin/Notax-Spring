package com.notax.detail;

import com.notax.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DetailController {

    @Autowired
    DetailService detailService;
    
    @RequestMapping("/detail")
    public String detail() {
        ProductVO productVO = detailService.selectProductById();
        System.out.println("productVO = " + productVO);
        return "detail";
    }
}
