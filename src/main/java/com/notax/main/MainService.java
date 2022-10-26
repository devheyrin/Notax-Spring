package com.notax.main;

import com.notax.vo.MainRankingVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    @Autowired
    MainDAO mainDAO;

    public MainRankingVO selectRank() {
        return mainDAO.selectRank();
    }
}
