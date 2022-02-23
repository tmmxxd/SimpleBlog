package priv.zg.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

/**
 * <p>
 * 博文表 前端控制器
 * </p>
 *
 * @author zg
 * @since 2022-02-17
 */
@Controller
public class TestController {


    @RequestMapping("test")
    public String t1() {
        return "manage/manage_index";
    }

    @RequestMapping("get")
    @ResponseBody
    public String t2() {
        int i = new Random().nextInt(100) + 1;
        return String.valueOf(i);
    }
}

