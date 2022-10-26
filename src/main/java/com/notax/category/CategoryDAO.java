package com.notax.category;

import com.notax.vo.ProductCategoryVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface CategoryDAO {
    public ArrayList<ProductCategoryVO> selectProductByMain(int main_no);
    public ArrayList<ProductCategoryVO> selectDuty();
    public ArrayList<ProductCategoryVO> selectMiddle(int main_no);
    public ArrayList<ProductCategoryVO> selectBrand(int main_no);
    public ArrayList<ProductCategoryVO> selectMain();

}
