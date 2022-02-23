package priv.zg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import priv.zg.domain.SetArticleSort;

/**
 * 针对表【set_article_sort(文章设置分类表)】的数据库操作Mapper
 *
 * @author zg
 * @date 2022-02-21 17:03:53
 */
public interface SetArticleSortMapper extends BaseMapper<SetArticleSort> {

    int deleteByPrimaryKey(Long id);

    int insert(SetArticleSort record);

    int insertSelective(SetArticleSort record);

    SetArticleSort selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SetArticleSort record);

    int updateByPrimaryKey(SetArticleSort record);

}
