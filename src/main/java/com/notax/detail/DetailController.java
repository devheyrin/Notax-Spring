package com.notax.detail;

import com.notax.category.CategoryDAO;
import com.notax.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class DetailController {

    @Autowired
    DetailService detailService;
    @Autowired
    CategoryDAO categoryService;
    
    @RequestMapping("/detail/main-category/{main_no}/middle-category/{mid_cate_no}/product/{pd_no}")
    public String detail(@PathVariable("main_no") int main_no,
                         @PathVariable("pd_no") int pd_no,
                         @PathVariable("mid_cate_no") int mid_cate_no,
                         HttpSession session,
                         Model model) {

        ProductVO productVO = detailService.selectProductById(pd_no);
        List<ProductByDFSVO> productByDFSVOList = detailService.selectPriceByDFS(pd_no);
        List<ProductPhotoVO> productPhotoVOList = detailService.selectProductPhotoList(pd_no);

        ArrayList<ProductCategoryVO> mainList = categoryService.selectMain();
        ArrayList<ProductCategoryVO> middleList = categoryService.selectMiddle(main_no);

        String user_id = (String) session.getAttribute("SS_userId");
        System.out.println("user_id = " + user_id);
        boolean liked = detailService.isLiked(pd_no, user_id);
        model.addAttribute("liked", liked);

        String mainname = categoryService.mainname(main_no);
        model.addAttribute("mainname", mainname);
        model.addAttribute("main_no", main_no);

        String mid_name = categoryService.mid_name(main_no, mid_cate_no);
        model.addAttribute("mid_name", mid_name);

        model.addAttribute("product", productVO);
        model.addAttribute("priceList", productByDFSVOList);
        model.addAttribute("productPhotoList", productPhotoVOList);
        model.addAttribute("mainList", mainList);
        model.addAttribute("middleList", middleList);
        return "detail";
    }

    @ResponseBody
    @RequestMapping("/detail/{pd_no}/like")
    public String like(@PathVariable("pd_no") int pd_no,
                       @RequestParam String userid) {
        System.out.println("userid = " + userid);
        detailService.saveInterestedItem(pd_no, userid);
        return "ok";
    }

    @ResponseBody
    @RequestMapping("/detail/{pd_no}/dislike")
    public String dislike(@PathVariable("pd_no") int pd_no,
                       @RequestParam String userid) {
        System.out.println("userid = " + userid);
        detailService.deleteInterestedItem(pd_no, userid);
        return "ok";
    }
}
