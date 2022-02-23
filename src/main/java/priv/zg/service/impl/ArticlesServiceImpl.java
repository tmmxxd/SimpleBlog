package priv.zg.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import priv.zg.domain.Articles;
import priv.zg.service.ArticlesService;
import priv.zg.mapper.ArticlesMapper;
import org.springframework.stereotype.Service;

/**
 * 【articles(博文表)】数据库操作Service实现
 *
 * @author zg
 * @date 2022-02-21 17:02:51
 */
@Service
public class ArticlesServiceImpl extends ServiceImpl<ArticlesMapper, Articles>
        implements ArticlesService {

}




