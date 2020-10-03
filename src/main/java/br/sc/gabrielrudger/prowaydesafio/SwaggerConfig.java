package br.sc.gabrielrudger.prowaydesafio;

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
public class SwaggerConfig {                                    
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())                          
          .build()
          .apiInfo(ApiEndPointsInfo());
    }
    
    private ApiInfo ApiEndPointsInfo() {
    	return new ApiInfoBuilder().title("Aplicativo de Basquete")
    			.description("Este programa foi criado para ajudar Maria a acompanhar os resultados dos seus jogos de basquete.")
    			.license("Criado por Gabriel Rüdger")
    			.licenseUrl("")
    			.version("1.0")
    			.build();
    }
}