package com.plazzymarket.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.plazzymarket.web.controller"))
                .build();
    }

private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("Api de productos")
                .description("Servicio para la consulta de productos de un supermercado")
                .license("Apache 2.0")
                .version("1.0.0")
                .license("https://www.apache.org/licenses/LICENSE-2.0")
                .build();
}

}
