package priv.zg.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import priv.zg.domain.UserFriends;
import priv.zg.service.UserFriendsService;
import priv.zg.mapper.UserFriendsMapper;
import org.springframework.stereotype.Service;

/**
 * 【user_friends(用户好友表)】数据库操作Service实现
 *
 * @author tanshizhong
 * @date 2022-02-21 17:02:52
 */
@Service
public class UserFriendsServiceImpl extends ServiceImpl<UserFriendsMapper, UserFriends>
        implements UserFriendsService {

}




