package com.notax.detail;

import com.notax.vo.CouponVO;
import com.notax.vo.ProductByDFSVO;
import com.notax.vo.ProductVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DetailDAO {
    public ProductVO selectProductById(int pd_no);
    public List<ProductByDFSVO> selectPriceByDFS(int pd_no);
    public List<CouponVO> selectCouponList();
}
