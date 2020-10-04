package com.demo.play.service.Impl;

import com.demo.play.mapper.ScoreMapper;
import com.demo.play.service.ScoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ScoreServiceImpl implements ScoreService {
    @Resource
    private ScoreMapper scoreMapper;
    @Override
    public Object getMaxScore() {
        return  scoreMapper.getMaxScore();
    }
}
