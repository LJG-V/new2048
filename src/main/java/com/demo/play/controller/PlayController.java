package com.demo.play.controller;

import com.demo.play.service.ScoreService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RestController
public class PlayController {
    @Resource
    private ScoreService scoreService;

    @RequestMapping("/maxScore")
    public Object getScore() {
        return scoreService.getMaxScore();
    }
    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView view=new ModelAndView();
        // 设置跳转的视图 默认映射到 src/main/resources/templates/{viewName}.html
        view.setViewName("play");
        view.addObject("title","这里是主页");
        Object max_score=scoreService.getMaxScore();
        view.addObject("max_score",max_score);
        return view;
    }
}
