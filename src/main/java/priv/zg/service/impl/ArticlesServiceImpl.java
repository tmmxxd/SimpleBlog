package priv.zg.service.impl;

import priv.zg.entity.Articles;
import priv.zg.mapper.ArticlesMapper;
import priv.zg.service.IArticlesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 博文表 服务实现类
 * </p>
 *
 * @author xm
 * @since 2022-02-17
 */
@Service
public class ArticlesServiceImpl extends ServiceImpl<ArticlesMapper, Articles> implements IArticlesService {

}
