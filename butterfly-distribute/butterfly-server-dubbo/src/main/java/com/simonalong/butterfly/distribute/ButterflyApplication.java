package com.simonalong.butterfly.distribute;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author shizi
 * @since 2020/4/28 12:16 AM
 */
@EnableDubbo
@SpringBootApplication
public class ButterflyApplication {

    public static void main(String... args) {
        SpringApplication.run(ButterflyApplication.class, args);
    }
}
