package priv.zg.service.impl;

import priv.zg.entity.Labels;
import priv.zg.mapper.LabelsMapper;
import priv.zg.service.ILabelsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 标签表 服务实现类
 * </p>
 *
 * @author xm
 * @since 2022-02-17
 */
@Service
public class LabelsServiceImpl extends ServiceImpl<LabelsMapper, Labels> implements ILabelsService {

}
