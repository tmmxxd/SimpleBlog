package priv.zg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import priv.zg.domain.Articles;

/**
 * 针对表【articles(博文表)】的数据库操作Mapper
 *
 * @author zg
 * @date 2022-02-21 17:03:53
 */
public interface ArticlesMapper extends BaseMapper<Articles> {

    int deleteByPrimaryKey(Long id);

    int insert(Articles record);

    int insertSelective(Articles record);

    Articles selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Articles record);

    int updateByPrimaryKey(Articles record);

}
