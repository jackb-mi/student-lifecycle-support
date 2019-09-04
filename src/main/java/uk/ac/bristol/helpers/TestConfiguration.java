package uk.ac.bristol.helpers;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import uk.ac.bristol.config.SpringTestConfig;

public class TestConfiguration {

    private static AnnotationConfigApplicationContext ctx;

    /**
     * Instantiates a new configuration.
     */

    static {
        ctx = new AnnotationConfigApplicationContext();
        ctx.register(SpringTestConfig.class);
        ctx.refresh();
    }

//    public static URL targetUrl() {
//        String url = (String) ctx.getBean("targetUrl");
//
//        try {
//            return new URL(url);
//        } catch (MalformedURLException e) {
//            return null;
//        }
//    }


    public static String targetUrl() {
        String url = (String) ctx.getBean("targetUrl");

        return url;
    }
}
