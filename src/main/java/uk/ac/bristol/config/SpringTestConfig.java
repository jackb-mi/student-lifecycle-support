package uk.ac.bristol.config;

import org.springframework.context.annotation.Bean;

public class SpringTestConfig {

//    private ConfigProperties configProperties;

    private ConfigProperties configProperties = new ConfigProperties();

    @Bean(name = "targetUrl")
    public String getTargetUrl() {
        return configProperties.getProperty("target.url");
    }
}
