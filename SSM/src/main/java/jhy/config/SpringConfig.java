package jhy.config;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//声明是配置类
@Configurable
//<!--    配置从哪个文件开始递归扫描注解  -->
//设置spring配置类加载bean时的过滤规则，当前要求排除掉表现层对应的bean
//excludeFilters属性：设置扫描加载bean时，排除的过滤规则
//type属性：设置排除规则，当前使用按照bean定义时的注解类型进行排除
//classes属性：设置排除的具体注解类，当前设置排除@Controller定义的bean
@ComponentScan(value = "jhy",
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                classes = Controller.class
        )
)

//引入JDBC配置文件
@PropertySource("classpath:jdbc.properties")

//myhabits配置mysql数据库代理dao
@Import({JdbcConfig.class, MybatisConfig.class})

//开启注解式事务驱动
@EnableTransactionManagement

//开启注解的AOP功能
@EnableAspectJAutoProxy
public class SpringConfig {

}
