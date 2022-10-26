package com.notax.main;

import com.notax.vo.MainRankingVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MainDAO {
    public MainRankingVO selectRank();
}
