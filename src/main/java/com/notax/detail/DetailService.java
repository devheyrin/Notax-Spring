package com.notax.detail;

import com.notax.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailService {

    @Autowired
    DetailDAO detailDAO;

    public ProductVO selectProductById(int pd_no) {
        return detailDAO.selectProductById(pd_no);
    }
}
