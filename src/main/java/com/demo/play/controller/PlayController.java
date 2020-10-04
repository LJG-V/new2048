package com.demo.play.controller;

import com.demo.play.service.ScoreService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RestController
public class PlayController {
    @Resource
    private ScoreService scoreService;

    @RequestMapping("/getMaxScore")
    public Object getScore() {
        return scoreService.getMaxScore();
    }
    @RequestMapping("/maxScore")
    public void setScore(@RequestParam("max_score") String max_score) {
        scoreService.setMaxScore(max_score);
    }
    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView view=new ModelAndView();
        // 设置跳转的视图 默认映射到 src/main/resources/templates/{viewName}.html
        view.setViewName("play");
        String max_score=scoreService.getMaxScore();
        scoreService.setMaxScore(max_score);
        view.addObject("max_score",max_score);
        return view;
    }
}
