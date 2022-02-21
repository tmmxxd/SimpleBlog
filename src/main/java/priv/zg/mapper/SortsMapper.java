package priv.zg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import priv.zg.domain.Sorts;

/**
 * 针对表【sorts(分类表)】的数据库操作Mapper
 *
 * @author tanshizhong
 * @date 2022-02-21 17:03:53
 */
public interface SortsMapper extends BaseMapper<Sorts> {

    int deleteByPrimaryKey(Long id);

    int insert(Sorts record);

    int insertSelective(Sorts record);

    Sorts selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Sorts record);

    int updateByPrimaryKey(Sorts record);

}
