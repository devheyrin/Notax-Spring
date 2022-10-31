package com.notax.likes;

import com.notax.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LikesService {

    @Autowired
    LikesDAO likesDAO;

    public List<ProductVO> selectLikedProductList(String user_id) {
        return likesDAO.selectLikedProductList(user_id);
    }
}
