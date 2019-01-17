package com.mengyu.sofarpc;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.mengyu.sofaapi.MessageService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 见善
 * @date 2019/1/17 上午9:49
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SofaBootRpcTest {

    @SofaReference
    private MessageService messageService;

    @Test
    public void test() {
        messageService.message("aaaa");
    }

}
