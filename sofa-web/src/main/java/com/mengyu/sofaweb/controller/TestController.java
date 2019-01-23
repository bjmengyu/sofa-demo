package com.mengyu.sofaweb.controller;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import com.mengyu.sofaapi.MessageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 见善
 * @date 2019/1/16 下午7:34
 */
@RestController
@RequestMapping(value = "test")
public class TestController {

    @SofaReference(interfaceType = MessageService.class, binding = @SofaReferenceBinding(bindingType = "bolt"))
    private MessageService messageService;

    @RequestMapping("/test")
    public String test(String data){
        return String.format("%s data",data);
    }

    @RequestMapping("/message")
    public String message(String data){
        return messageService.message(data);
    }



}
