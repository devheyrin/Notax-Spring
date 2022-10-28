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

    @RequestMapping("/main-category/id={main_no}")
    public String main(@PathVariable("main_no") int main_no, Model model) {
        ArrayList<ProductCategoryVO> categoryList = categoryService.selectProductByMain(main_no);
        model.addAttribute("productCategory", categoryList);

        ArrayList<ProductCategoryVO> mainname = categoryService.mainname(main_no);
        model.addAttribute("name", mainname);

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

    @RequestMapping("/main-category/id={main_no}/middle-category/{mid_cate_no}")
    public String middle(@PathVariable("main_no") int main_no, @PathVariable("mid_cate_no") int mid_cate_no, Model model) {
        ArrayList<ProductCategoryVO> selectProductByMiddle = categoryService.selectProductByMiddle(main_no, mid_cate_no);
        model.addAttribute("ProductByMiddle", selectProductByMiddle);

        ArrayList<ProductCategoryVO> middlename = categoryService.middlename(main_no, mid_cate_no);
        model.addAttribute("name", middlename);

        ArrayList<ProductCategoryVO> mainList = categoryService.selectMain();
        model.addAttribute("mainList", mainList);

        ArrayList<ProductCategoryVO> middleList = categoryService.selectMiddle(main_no);
        model.addAttribute("middleList", middleList);

        ArrayList<ProductCategoryVO> subList = categoryService.selectSub(main_no, mid_cate_no);
        model.addAttribute("subList", subList);

        return "middle-category";
    }

    @RequestMapping("/main-category/id={main_no}/middle-category/{mid_cate_no}/sub-category/{sub_no}")
    public String sub(@PathVariable("main_no") int main_no, @PathVariable("mid_cate_no") int mid_cate_no,
                      @PathVariable("sub_no") int sub_no, Model model) {
        ArrayList<ProductCategoryVO> selectProductBySub = categoryService.selectProductBySub(main_no, mid_cate_no, sub_no);
        model.addAttribute("selectProductBySub", selectProductBySub);

        return "sub-category";
    }

}
