package br.com.codenation.challenge.auth.docs;

import br.com.codenation.challenge.core.docs.BaseSwaggerConfig;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {
    public SwaggerConfig() {
        super("br.com.codenation.challenge.auth.endpoint.controller");
    }
}
