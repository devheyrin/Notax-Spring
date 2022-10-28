package com.notax.category;

import com.notax.vo.ProductCategoryVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface CategoryDAO {
    public ArrayList<ProductCategoryVO> selectProductByMain(int main_no);
    public ArrayList<ProductCategoryVO> mainname(int main_no);
    public ArrayList<ProductCategoryVO> middlename(int main_no, int mid_cate_no);
    public ArrayList<ProductCategoryVO> subname(int main_no, int mid_cate_no, int sub_no);
    public ArrayList<ProductCategoryVO> selectDuty();

    public ArrayList<ProductCategoryVO> selectMiddle(int main_no);

    public ArrayList<ProductCategoryVO> selectBrand(int main_no);

    public ArrayList<ProductCategoryVO> selectMain();

    public ArrayList<ProductCategoryVO> selectProductByMiddle(int main_no, int mid_cate_no);
    public ArrayList<ProductCategoryVO> selectSub(int main_no, int mid_cate_no);
    public ArrayList<ProductCategoryVO> selectProductBySub(int main_no, int mid_cate_no, int sub_no);
}
