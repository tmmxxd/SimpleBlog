package priv.zg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 页面跳转 控制器(RESTful 风格)
 *
 * @author zg
 * @date 2021/11/04
 */
@Controller
public class PageController {

    @RequestMapping("/error/{errorCode}")
    public String error(@PathVariable String errorCode) {
        return "error/" + errorCode;
    }

    @RequestMapping("/admin")
    public String manageIndex() {
        return "manage/manage_index";
    }

}
