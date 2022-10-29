package com.notax.detail;

import com.notax.vo.CouponVO;
import com.notax.vo.ProductByDFSVO;
import com.notax.vo.ProductPhotoVO;
import com.notax.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DetailService {

    @Autowired
    DetailDAO detailDAO;

    public ProductVO selectProductById(int pd_no) {
        return detailDAO.selectProductById(pd_no);
    }

    public List<ProductByDFSVO> selectPriceByDFS(int pd_no) {
        List<ProductByDFSVO> dfsPriceList = detailDAO.selectPriceByDFS(pd_no);
        List<CouponVO> couponList = detailDAO.selectCouponList();

        // 쿠폰리스트의 면세점 번호와 면세점별 가격리스트의 면세점 번호를 비교해 면세점 번호가 일치하는 경우에만 쿠폰을 추가
        for (ProductByDFSVO dfs : dfsPriceList) {
            int dfs_no = dfs.getDfs_no();
            int total_price = dfs.getTotal_price();
            List<CouponVO> dfsCouponList = new ArrayList<>();
            for (CouponVO coupon : couponList) {
                int coupon_dfs_no = coupon.getDfs_no();
                int discount_amt = coupon.getDiscount_amt();
                System.out.println("coupon = " + coupon.getCp_unit());

                if (dfs_no == coupon_dfs_no && total_price > discount_amt) {
                    System.out.println("dfs_no = " + dfs_no);
                    System.out.println("coupon_dfs_no = " + coupon_dfs_no);
                    dfsCouponList.add(coupon);
                }
            }
            dfs.setCoupon_list(dfsCouponList);
        }
        return dfsPriceList;
    }

    public List<ProductPhotoVO> selectProductPhotoList(int pd_no) {
        return detailDAO.selectProductPhotoList(pd_no);
    }

}
