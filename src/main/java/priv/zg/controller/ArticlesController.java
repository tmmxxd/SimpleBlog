package priv.zg.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 博文表 前端控制器
 * </p>
 *
 * @author xm
 * @since 2022-02-17
 */
@Controller
@RequestMapping("/articles")
public class ArticlesController {


    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "ok";
    }

}

