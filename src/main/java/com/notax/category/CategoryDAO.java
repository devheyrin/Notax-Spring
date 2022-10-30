package com.notax.category;

import com.notax.vo.ProductCategoryVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface CategoryDAO {
    public LinkedList<ProductCategoryVO> selectProductByMain(int main_no, int value);

    public LinkedList<ProductCategoryVO> searchProductByMain(int main_no, String text, int value);

    public String mainname(int main_no);

    public String mid_name(int main_no, int mid_cate_no);

    public String sub_name(int main_no, int mid_cate_no, int sub_no);

    public ArrayList<ProductCategoryVO> selectDuty();

    public ArrayList<ProductCategoryVO> selectMiddle(int main_no);

    public ArrayList<ProductCategoryVO> selectBrand(int main_no);

    public ArrayList<ProductCategoryVO> selectMain();

    public ArrayList<ProductCategoryVO> selectProductByMiddle(int main_no, int mid_cate_no, int value);

    public ArrayList<ProductCategoryVO> searchProductByMiddle(int main_no, int mid_cate_no, String text, int value);

    public ArrayList<ProductCategoryVO> selectSub(int main_no, int mid_cate_no);

    public ArrayList<ProductCategoryVO> selectProductBySub(int main_no, int mid_cate_no, int sub_no, int value);

    public ArrayList<ProductCategoryVO> searchProductBySub(int main_no, int mid_cate_no, int sub_no, String text, int value);
}
