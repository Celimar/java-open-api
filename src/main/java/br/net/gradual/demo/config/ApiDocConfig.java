package br.net.gradual.demo.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiDocConfig {

//    @Bean
//    public GroupedOpenApi userOpenApi() {
//        String packagesToscan[] = {"br.net.gradual.demo"};
//        return GroupedOpenApi.builder().packagesToScan(packagesToscan).group("users")
//                .build();
//    }

    @Bean
    public OpenAPI springShopOpenAPI(@Value("${app.name}") String name,
                                     @Value("${app.description}") String description,
                                     @Value("${app.version}") String version) {
        return new OpenAPI()
                .info(new Info()
                        .title(name)
                        .description(description)
                        .version(version)
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("SpringShop Wiki Documentation")
                        .url("https://springshop.wiki.github.org/docs"));
    }
}
