package priv.zg.service.impl;

import priv.zg.entity.Users;
import priv.zg.mapper.UsersMapper;
import priv.zg.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author xm
 * @since 2022-02-17
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
