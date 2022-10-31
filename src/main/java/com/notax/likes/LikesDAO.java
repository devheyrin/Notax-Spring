package com.notax.likes;

import com.notax.vo.ProductVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LikesDAO {
    List<ProductVO> selectLikedProductList(String user_id);
}
