package priv.zg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import priv.zg.domain.SetArticleLabel;

/**
 * 针对表【set_article_label(文章设置标签表)】的数据库操作Mapper
 *
 * @author zg
 * @date 2022-02-21 17:03:53
 */
public interface SetArticleLabelMapper extends BaseMapper<SetArticleLabel> {

    int deleteByPrimaryKey(Long id);

    int insert(SetArticleLabel record);

    int insertSelective(SetArticleLabel record);

    SetArticleLabel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SetArticleLabel record);

    int updateByPrimaryKey(SetArticleLabel record);

}
