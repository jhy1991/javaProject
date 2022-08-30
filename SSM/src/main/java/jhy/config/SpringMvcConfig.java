package jhy.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//声明是配置类
@Configurable
//<!--    配置从哪个文件开始递归扫描注解  -->
@ComponentScan({"jhy.controller", "jhy.config"})
//开启json数据类型自动转换
@EnableWebMvc
public class SpringMvcConfig {
}
