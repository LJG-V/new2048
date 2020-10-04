package com.demo.play.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Score implements Serializable {
    private String maxScore;

    @Override
    public String toString() {
        return "Score{" +
                "maxScore='" + maxScore + '\'' +
                '}';
    }

    public String getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(String maxScore) {
        this.maxScore = maxScore;
    }
}
