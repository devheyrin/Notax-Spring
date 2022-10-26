package com.notax.category;

import com.notax.vo.ProductCategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping("/main-category")
    public String main() {
        ProductCategoryVO productCategoryVO = categoryService.selectProductByMain();
        System.out.println("productcategoryVO = " + productCategoryVO);
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
