package com.notax.main;

import com.notax.vo.MainRankingVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface MainDAO {
    public ArrayList<MainRankingVO> selectRank();

    public ArrayList<MainRankingVO> selectPdListByDate();
}
