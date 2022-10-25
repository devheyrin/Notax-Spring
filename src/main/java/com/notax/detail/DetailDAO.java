package com.notax.detail;

import com.notax.vo.ProductVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DetailDAO {
    public ProductVO selectProductById();
}
