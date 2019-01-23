package com.mengyu.sofarpc.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.mengyu.sofaapi.MessageService;

/**
 * @author 见善
 * @date 2019/1/16 下午7:47
 */
@SofaService(interfaceType=MessageService.class,uniqueId = "messageService",bindings = { @SofaServiceBinding(bindingType = "bolt")})
public class MessageServiceImpl implements MessageService {
    @Override
    public String message(String message) {
        {
            message  = String.format("%s %s",message,Math.random());
            System.out.println(message);
            return message;
        }
    }
}
