package com.notax.category;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {
    @RequestMapping("/main-category")
    public String mainCategory() {
        return "main-category";
    }
}
