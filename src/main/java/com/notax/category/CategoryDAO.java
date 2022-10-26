package com.notax.category;

import com.notax.vo.ProductCategoryVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryDAO {
    public ProductCategoryVO selectProductByMain();
}
