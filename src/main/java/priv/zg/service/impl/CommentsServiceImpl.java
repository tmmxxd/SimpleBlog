package priv.zg.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import priv.zg.domain.Comments;
import priv.zg.service.CommentsService;
import priv.zg.mapper.CommentsMapper;
import org.springframework.stereotype.Service;

/**
 * 【comments(评论表)】数据库操作Service实现
 *
 * @author tanshizhong
 * @date 2022-02-21 17:02:52
 */
@Service
public class CommentsServiceImpl extends ServiceImpl<CommentsMapper, Comments>
        implements CommentsService {

}




