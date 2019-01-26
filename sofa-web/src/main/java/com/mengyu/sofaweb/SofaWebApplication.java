package com.mengyu.sofaweb;

import com.mengyu.sofaapi.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.mengyu.sofarpc","com.mengyu.sofaweb.controller"})
public class SofaWebApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication springApplication = new SpringApplication(SofaWebApplication.class);
        ApplicationContext applicationContext = springApplication.run(args);
//
//        MessageService messageService = (MessageService) applicationContext.getBean("messageServiceImpl");
//        Thread.sleep(3000);
//        System.out.println(messageService.message("aaaaa"));
    }

}

