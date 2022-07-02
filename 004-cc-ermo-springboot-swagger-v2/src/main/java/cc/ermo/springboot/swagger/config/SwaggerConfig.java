package cc.ermo.springboot.swagger.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger Config.
 *
 * @author ermo
 * @since 1.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(true)
                .select()
                .paths(PathSelectors.any())
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger API")
                .description("this is Swagger API test")
                .termsOfServiceUrl("http://xxxxxx.com/")
                .contact(new Contact("ermo", "https://ermo.cc", "lvtaos4@gmail.com"))
                .version("1.0")
                .build();
    }
}
