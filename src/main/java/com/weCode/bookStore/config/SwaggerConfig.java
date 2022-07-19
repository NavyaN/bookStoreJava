package com.weCode.bookStore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket bookStoreAPiDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                 .select()
                .apis(RequestHandlerSelectors.basePackage("com.weCode.bookStore.controller"))
                .paths(regex("/.*"))
                .build()
                .apiInfo(apiMetaData());
    }

    private ApiInfo apiMetaData() {
        return new ApiInfo("Book Store REST API", "All API's for Bok Store Application", "1.0", "Terms and Condition Url",
        new Contact("Devi navya Nuchu", "https://book-store-app93.herokuapp.com/api/v1/books", "navya.nuchu@gmail.com"),
                "book store", "license url", Collections.emptyList());
    }

}
