package com.notax.vo;

import lombok.Data;

@Data
public class ProductVO {
    private int pd_no;
//    private int sub_no;
    private String sub_name;
//    private int brand_no;
    private String brand_name;
    private String pd_name;
    private int pd_price;
    private int pd_views;
    private String pd_date;
    private String pd_more;
    private String pdphoto_link;
}
