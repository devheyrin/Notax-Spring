package com.notax.likes;

import com.notax.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LikesController {

    @Autowired
    LikesService likesService;

    @RequestMapping("/mypage/likes")
    public String likedItems(HttpSession session) {
        String user_id = (String) session.getAttribute("SS_userId");
        List<ProductVO> likedProductList = likesService.selectLikedProductList(user_id);

        return "mypage-likes";
    }


}
