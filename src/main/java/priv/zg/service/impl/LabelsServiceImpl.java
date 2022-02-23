package priv.zg.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import priv.zg.domain.Labels;
import priv.zg.service.LabelsService;
import priv.zg.mapper.LabelsMapper;
import org.springframework.stereotype.Service;

/**
 * 【labels(标签表)】数据库操作Service实现
 *
 * @author zg
 * @date 2022-02-21 17:02:52
 */
@Service
public class LabelsServiceImpl extends ServiceImpl<LabelsMapper, Labels>
        implements LabelsService {

}




