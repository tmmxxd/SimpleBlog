package priv.zg.service.impl;

import priv.zg.entity.Comments;
import priv.zg.mapper.CommentsMapper;
import priv.zg.service.ICommentsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评论表 服务实现类
 * </p>
 *
 * @author xm
 * @since 2022-02-17
 */
@Service
public class CommentsServiceImpl extends ServiceImpl<CommentsMapper, Comments> implements ICommentsService {

}
