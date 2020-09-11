package cn.sj.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {
    /**
     *  整个swagger的配置项,来指派扫描包
     */
    @Bean
    public Docket getDocket(){
        //设置文档的使用类型
        
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        docket.apiInfo(this.getApiInfo());
        docket.select().apis(RequestHandlerSelectors.basePackage("cn.sj.springboot.controller"))
                .paths(PathSelectors.any()).build();
        return docket;
    }
    
    //api的说明文件
    private ApiInfo getApiInfo(){
        return new ApiInfoBuilder().title("springBoot中使用Swagger构建项目说明信息").description("更多选择请关注www.sj.cn")
                .termsOfServiceUrl("http://www.baidu.com").license("sj").version("1.0").build();
    }
    

}
