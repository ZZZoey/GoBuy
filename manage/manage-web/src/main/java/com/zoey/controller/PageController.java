package com.zoey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转controller
 */
@Controller
public class PageController {
    /**
     * 打开首页
     */
    @RequestMapping("/")
    public String showIndex(){
        return "index";//springmvc中配置了前缀和后缀，所以会自动拼接为/WEB-INF/jsp/index.jsp
    }

    /**
     * 展示其他页面
     * @param page
     * @return
     */
    @RequestMapping("/{page}")
    public String showpage(@PathVariable String page){
        return page;
    }

}
