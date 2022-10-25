package com.notax.category;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {

    @RequestMapping("/main-category")
    public String main() {
        return "main-category";
    }

    @RequestMapping("/middle-category")
    public String middle() {
        return "middle-category";
    }

    @RequestMapping("/sub-category")
    public String sub() {
        return "sub-category";
    }

}
