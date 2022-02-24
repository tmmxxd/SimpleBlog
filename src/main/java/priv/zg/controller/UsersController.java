package priv.zg.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import priv.zg.domain.Users;
import priv.zg.service.UsersService;
import priv.zg.util.CheckUtils;

import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author zg
 * @since 2022-02-17
 */
@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;


    @GetMapping("/admin")
    public String admin() {
        return "/manage/users/users_index";
    }

    @GetMapping("/find")
    @ResponseBody
    public Page<Users> find(Users users, Integer page, Integer pageSize) {
        if (!CheckUtils.checkPage(page, pageSize)) {
            throw new RuntimeException("分页信息错误");
        }
        BaseMapper<Users> mapper = usersService.getBaseMapper();
        Page<Users> pagArgs = new Page<>(page, pageSize);
        return mapper.selectPage(pagArgs, new QueryWrapper<>(users));
    }

}

