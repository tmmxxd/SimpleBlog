package priv.zg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import priv.zg.domain.Comments;

/**
 * 针对表【comments(评论表)】的数据库操作Mapper
 *
 * @author zg
 * @date 2022-02-21 17:03:53
 */
public interface CommentsMapper extends BaseMapper<Comments> {

    int deleteByPrimaryKey(Long id);

    int insert(Comments record);

    int insertSelective(Comments record);

    Comments selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Comments record);

    int updateByPrimaryKey(Comments record);

}
