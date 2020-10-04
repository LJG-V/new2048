package com.demo.play.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface ScoreMapper {
    @Select({
            "SELECT maxScore FROM score"
    })
    String getMaxScore();

    @Update({
            "UPDATE score SET maxScore=#{maxScore}"
    })
    void setMaxScore(String score);
}
