package priv.zg.service.impl;

import priv.zg.entity.UserFriends;
import priv.zg.mapper.UserFriendsMapper;
import priv.zg.service.IUserFriendsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户好友表 服务实现类
 * </p>
 *
 * @author xm
 * @since 2022-02-17
 */
@Service
public class UserFriendsServiceImpl extends ServiceImpl<UserFriendsMapper, UserFriends> implements IUserFriendsService {

}
