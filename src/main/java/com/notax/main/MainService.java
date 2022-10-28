package com.notax.main;

import com.notax.vo.MainRankingVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MainService {

    @Autowired
    MainDAO mainDAO;

    public ArrayList<MainRankingVO> selectRank() {
        return mainDAO.selectRank();
    }
}
