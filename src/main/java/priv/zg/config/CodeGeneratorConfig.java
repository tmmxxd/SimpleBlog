package priv.zg.config;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.fill.Column;
import com.baomidou.mybatisplus.generator.fill.Property;

/**
 * 代码生成器模版配置
 *
 * @author tsz
 * @date 2022-02-17
 */
public class CodeGeneratorConfig {

    /**
     * 数据源配置
     */
    private static final DataSourceConfig DATA_SOURCE_CONFIG = new DataSourceConfig
            .Builder("jdbc:mysql://localhost/simple_blog?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull", "root", "root")
            //.dbQuery(new MySqlQuery())
            //.schema("mybatis-plus")
            //.typeConvert(new MySqlTypeConvert())
            //.keyWordsHandler(new MySqlKeyWordsHandler())
            .build();

    /**
     * 全局配置
     */
    private GlobalConfig globalConfig() {
        return new GlobalConfig.Builder()
                .outputDir(System.getProperty("user.dir") + "/src/main/java")
                .author("tsz")
                //.enableKotlin()
                //.enableSwagger()
                //.dateType(DateType.TIME_PACK)
                //.commentDate("yyyy-MM-dd")
                .fileOverride()
                .build();
    }

    /**
     * 包配置
     */
    private PackageConfig packageConfig() {
        return new PackageConfig.Builder()
                .parent("priv.zg")
                //.moduleName("sys")
                //.entity("po")
                //.service("service")
                //.serviceImpl("service.impl")
                //.mapper("mapper")
                //.xml("mapper.xml")
                //.controller("controller")
                //.other("other")
                //.pathInfo(Collections.singletonMap(OutputFile.mapperXml, "D://"))
                .build();
    }

    /**
     * 模板配置
     */
    private TemplateConfig templateConfig() {
        return new TemplateConfig.Builder()
                //.disable(TemplateType.ENTITY)
                //.entity("/templates/entity.java")
                //.service("/templates/service.java")
                //.serviceImpl("/templates/serviceImpl.java")
                //.mapper("/templates/mapper.java")
                //.mapperXml("/templates/mapper.xml")
                //.controller("/templates/controller.java")
                .build();
    }

    /**
     * 注入配置
     */
    private InjectionConfig injectionConfig() {
        // 测试自定义输出文件之前注入操作，该操作再执行生成代码前 debug 查看
        return new InjectionConfig.Builder()
                .beforeOutputFile((tableInfo, objectMap) -> {
                    System.out.println("tableInfo: " + tableInfo.getEntityName() + " objectMap: " + objectMap.size());
                })
                //.customMap(Collections.singletonMap("test", "baomidou"))
                //.customFile(Collections.singletonMap("test.txt", "/templates/test.vm"))
                .build();
    }


    /**
     * 策略配置
     */
    private StrategyConfig strategyConfig() {
        return new StrategyConfig.Builder()
                .addInclude("t_simple")
                //.enableCapitalMode()
                //.enableSkipView()
                //.disableSqlFilter()
                //.likeTable(new LikeTable("USER"))
                //.addTablePrefix("t_", "c_")
                //.addFieldSuffix("_flag")
                .build(); // 设置需要生成的表名
    }

    /**
     * Entity 策略配置
     */
    private StrategyConfig entityStrategyConfig() {
        return new StrategyConfig.Builder()
                .entityBuilder()
                //.superClass(BaseEntity.class)
                .disableSerialVersionUID()
                .enableChainModel()
                .enableLombok()
                .enableRemoveIsPrefix()
                .enableTableFieldAnnotation()
                .enableActiveRecord()
                .versionColumnName("version")
                .versionPropertyName("version")
                .logicDeleteColumnName("deleted")
                .logicDeletePropertyName("deleteFlag")
                .naming(NamingStrategy.no_change)
                .columnNaming(NamingStrategy.underline_to_camel)
                .addSuperEntityColumns("id", "created_by", "created_time", "updated_by", "updated_time")
                .addIgnoreColumns("age")
                .addTableFills(new Column("create_time", FieldFill.INSERT))
                .addTableFills(new Property("updateTime", FieldFill.INSERT_UPDATE))
                .idType(IdType.AUTO)
                .formatFileName("%sEntity")
                .build();
    }

    /**
     * Controller  策略配置
     */
    private StrategyConfig controllerStrategyConfig() {
        return new StrategyConfig.Builder()
                .controllerBuilder()
                //.superClass(BaseController.class)
                .enableHyphenStyle()
                .enableRestStyle()
                .formatFileName("%sAction")
                .build();
    }

    /**
     * Service  策略配置
     */
    private StrategyConfig serviceStrategyConfig() {
        return new StrategyConfig.Builder()
                .serviceBuilder()
                //.superServiceClass(BaseService.class)
                //.superServiceImplClass(BaseServiceImpl.class)
                .formatServiceFileName("%sService")
                .formatServiceImplFileName("%sServiceImp")
                .build();
    }

    /**
     * Mapper  策略配置
     */
    private StrategyConfig mapperStrategyConfig() {
        return new StrategyConfig.Builder()
                .mapperBuilder()
                .superClass(BaseMapper.class)
                .enableMapperAnnotation()
                .enableBaseResultMap()
                .enableBaseColumnList()
                //.cache(MyMapperCache.class)
                .formatMapperFileName("%sDao")
                .formatXmlFileName("%sXml")
                .build();
    }
}
