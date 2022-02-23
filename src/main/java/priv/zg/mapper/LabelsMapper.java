package priv.zg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import priv.zg.domain.Labels;

/**
 * 针对表【labels(标签表)】的数据库操作Mapper
 *
 * @author zg
 * @date 2022-02-21 17:03:53
 */
public interface LabelsMapper extends BaseMapper<Labels> {

    int deleteByPrimaryKey(Long id);

    int insert(Labels record);

    int insertSelective(Labels record);

    Labels selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Labels record);

    int updateByPrimaryKey(Labels record);

}
