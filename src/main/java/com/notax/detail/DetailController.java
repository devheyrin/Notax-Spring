package com.notax.detail;

import com.notax.vo.CouponVO;
import com.notax.vo.ProductByDFSVO;
import com.notax.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class DetailController {

    @Autowired
    DetailService detailService;
    
    @RequestMapping("/detail/{pd_no}")
    public String detail(@PathVariable("pd_no") int pd_no, Model model) {
        System.out.println("dd");
        ProductVO productVO = detailService.selectProductById(pd_no);
        List<ProductByDFSVO> productByDFSVOList = detailService.selectPriceByDFS(pd_no);
        System.out.println("productVO = " + productVO);
        System.out.println("productByDFSVOList = " + productByDFSVOList);
        model.addAttribute("product", productVO);
        model.addAttribute("priceList", productByDFSVOList);
        return "detail";
    }

//    @ResponseBody
//    @RequestMapping("/detail/{pd_no}/dfs-coupon/{dfs_id}")
//    public List<CouponVO> coupons(@PathVariable("pd_no") int pd_no,
//                          @PathVariable("dfs_id") int dfs_id,
//                          Model model) {
//
//        List<CouponVO> couponVOList = detailService.selectCouponList(dfs_id);
//        System.out.println("couponVOList = " + couponVOList);
//
//        System.out.println("pd_no = " + pd_no);
//        System.out.println("dfs_id = " + dfs_id);
//
//        return couponVOList;
//    }
}
