package com.hcb;

import com.hcb.bean.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class GardenApplication {

    private static AnnotationConfigApplicationContext context = null;

    public static void main(String[] args) {
        SpringApplication.run(GardenApplication.class, args);

    }

    public static AnnotationConfigApplicationContext getContext() {
        if (context == null) {
            context = new AnnotationConfigApplicationContext();
            context.register(AppConfig.class);
            context.refresh();
        }
        return context;
    }

}
