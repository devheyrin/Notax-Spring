package com.notax.category;

import com.notax.vo.ProductCategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping("/main-category/{main_no}")
    public String main(@PathVariable("main_no") int main_no, Model model) {
        ArrayList<ProductCategoryVO> categoryList = categoryService.selectProductByMain(main_no);
        model.addAttribute("productCategory", categoryList);

        ArrayList<ProductCategoryVO> dutyList = categoryService.selectDuty();
        model.addAttribute("dutyList", dutyList);

        ArrayList<ProductCategoryVO> middleList = categoryService.selectMiddle(main_no);
        model.addAttribute("middleList", middleList);

        ArrayList<ProductCategoryVO> brandList = categoryService.selectBrand(main_no);
        model.addAttribute("brandList", brandList);

        ArrayList<ProductCategoryVO> mainList = categoryService.selectMain();
        model.addAttribute("mainList", mainList);
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
