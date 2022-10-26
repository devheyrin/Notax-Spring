package com.notax.vo;

import lombok.Data;

import java.util.List;

@Data
public class ProductByDFSVO {
    private int dfs_no;
    private String dfs_name;
    private int price;
    private int sale_percent;
    private int total_price;

    private List<CouponVO> coupon_list;
}
