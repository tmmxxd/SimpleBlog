package priv.zg.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import priv.zg.domain.Users;
import priv.zg.service.UsersService;
import priv.zg.mapper.UsersMapper;
import org.springframework.stereotype.Service;

/**
 * 【users(用户表)】数据库操作Service实现
 *
 * @author zg
 * @date 2022-02-21 17:02:52
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
        implements UsersService {

}




