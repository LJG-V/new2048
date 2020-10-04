package com.demo.play.mapper;

import com.demo.play.entity.Score;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ScoreMapper {
    @Select({
            "SELECT maxScore FROM score"
    })
    Integer getMaxScore();

}
