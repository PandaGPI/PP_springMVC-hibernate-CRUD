package ru.pirogov.web;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import ru.pirogov.web.config.WebConfig;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{
                WebConfig.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{
                "/"
        };
    }
}
