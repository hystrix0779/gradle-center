package com.nlx.center.web.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author Tony.niu (hystrix0779@yeah.net)
 * @version V1.0
 * @date 2020/10/10
 **/
@Configuration
@EnableSwagger2
public class Swagger2 {
    private final Contact DEFAULT_CONTACT = new Contact("牛立雄", "", "hystrix0779@yeah.net");
    @Bean
    public Docket createRestApi(Environment environment) {
        //设置要显示的swagger环境
        Profiles profiles=Profiles.of("prod");
        //获取项目环境
        boolean flag=environment.acceptsProfiles(profiles);
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("web")
                .enable(true)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.nlx.center.web.controller"))
                .paths(PathSelectors.any())
                .build()/*.globalOperationParameters(pars)*/;
    }
    private ApiInfo apiInfo() {
        return new ApiInfo("CallCenter", "子午智汇", "1.0", "urn:tos", DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<>());
    }
}
