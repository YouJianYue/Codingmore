package com.yjy.codingmore.config;


import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfiguration {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(apiInfo())
                .externalDocs(new ExternalDocumentation()
                        .description("SpringDoc Wiki Documentation")
                        .url("https://springdoc.org/v2"));
    }

    private Info apiInfo() {
        return new Info()
                .title("Codingmore Demo API Doc")
                .description("springfox swagger 3.0 demo")
                .version("1.0.0")
                .contact(new Contact()
                        .name("YouJianYue")
                        .url("https://github.com/YouJianYue")
                        .email("y787288129@163.com")
                )
                .license(new License()
                        .name("Apache License2.0")
                        .url("http://www.apache.org/licenses/LICENSE-2.0.txt")
                );
    }

}
