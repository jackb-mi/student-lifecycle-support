package uk.ac.bristol.config;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Component
public class ConfigProperties {

//    private static final Logger log = LoggerFactory.getLogger(ConfigProperties.class);

    private static Properties configProperties;

    public void init() throws IOException {

        String targetEnvironment = System.getProperty("target.environment");
//                String targetEnvironment ="test";

        configProperties = new Properties();

        ClassLoader loader = Thread.currentThread().getContextClassLoader();
//        InputStream resourceAsStream = loader.getResourceAsStream(targetEnvironment + ".properties");
        InputStream resourceAsStream = loader.getResourceAsStream(targetEnvironment + ".properties");

        configProperties.load(resourceAsStream);
    }
//
//    @PostConstruct
//    public void init() throws IOException {
//        if (configProperties == null) {
//            String targetEnvironment = System.getProperty("target.environment");
//
//            if (targetEnvironment == null) {
//                throw new RuntimeException("test environment has not been set in the run parameters, unable to run tests.");
//            }
//
//            try {
//                configProperties = new Properties();
//
//                ClassLoader loader = Thread.currentThread().getContextClassLoader();
//                InputStream resourceAsStream = loader.getResourceAsStream(targetEnvironment + ".properties");
//
//                configProperties.load(resourceAsStream);
//
////                logProperties(targetEnvironment);
//            } catch (IOException e) {
////                log.error("Unable to load the properties for: " + targetEnvironment);
//                throw e;
//            }
//        }
//    }
//
//    private void logProperties(String targetEnvironment) {
//        log.info("Configuration Properties for environment: {}", targetEnvironment);
//
//        for (Map.Entry<Object, Object> property : configProperties.entrySet()) {
//            log.info("{}={}", property.getKey(), property.getValue());
//        }
//    }

    public String getProperty(String key) {

        return configProperties.getProperty(key);
    }

    public String getProperty(String key, String def) {

        return configProperties.getProperty(key, def);
    }
}
