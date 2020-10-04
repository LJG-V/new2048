package com.demo.play.service;

import org.springframework.stereotype.Service;

@Service
public interface ScoreService {
    String getMaxScore();

    void setMaxScore(String  score);
}
