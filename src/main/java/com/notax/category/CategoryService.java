package com.notax.category;


import com.notax.vo.ProductCategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    CategoryDAO categoryDAO;

    public ProductCategoryVO selectProductByMain() {
        return categoryDAO.selectProductByMain();
    }
}
