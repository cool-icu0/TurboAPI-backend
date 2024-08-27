package com.cool.turboapiinterface;

import com.cool.turboapiclientsdk.client.TurboApiClient;
import com.cool.turboapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class TurboApiInterfaceApplicationTests {
    // 注入一个名为turboApiClient的Bean
    @Resource
    private TurboApiClient turboApiClient;
    // 表示这是一个测试方法
    @Test
    void contextLoads() {
        // 调用turboApiClient的getNameByGet方法，并传入参数"cool"，将返回的结果赋值给result变量
        String result = turboApiClient.getNameByGet("cool");
        // 创建一个User对象
        User user = new User();
        // 设置User对象的username属性为"cool123"
        user.setUsername("cool123");
        // 调用turboApiClient的getUserNameByPost方法，并传入user对象作为参数，将返回的结果赋值给usernameByPost变量
        String usernameByPost = turboApiClient.getUserNameByPost(user);
        // 打印result变量的值
        System.out.println(result);
        // 打印usernameByPost变量的值
        System.out.println(usernameByPost);
    }

}
