package ru.pirogov.web;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import ru.pirogov.web.config.WebConfig;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{
                WebConfig.class
        };
    }

    protected String[] getServletMappings() {
        return new String[]{
                "/"
        };
    }
}
