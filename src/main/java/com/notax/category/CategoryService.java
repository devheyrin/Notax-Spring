package com.notax.category;


import com.notax.vo.ProductCategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CategoryService {

    @Autowired
    CategoryDAO categoryDAO;

    public ArrayList<ProductCategoryVO> selectProductByMain(int main_no) {
        return categoryDAO.selectProductByMain(main_no);
    }

    public ArrayList<ProductCategoryVO> selectDuty() {
        return categoryDAO.selectDuty();
    }

    public ArrayList<ProductCategoryVO> selectMiddle(int main_no) {
        return categoryDAO.selectMiddle(main_no);
    }

    public ArrayList<ProductCategoryVO> selectBrand(int main_no) {
        return categoryDAO.selectBrand(main_no);
    }

    public ArrayList<ProductCategoryVO> selectMain() {
        return categoryDAO.selectMain();
    }

    public ArrayList<ProductCategoryVO> selectProductByMiddle(int main_no, int mid_cate_no) {
        return categoryDAO.selectProductByMiddle(main_no, mid_cate_no);
    }

}
