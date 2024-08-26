package com.cool.turboapiinterface;


import com.cool.turboapiinterface.client.NameApiClient;
import com.cool.turboapiinterface.model.User;

public class Main {
    public static void main(String[] args) {
        String accessKey = "cool";
        String secretKey = "abcdefg";
        NameApiClient nameApiClient = new NameApiClient(accessKey, secretKey);
        String result1 = nameApiClient.getNameByGet("Cool");
        String result2 = nameApiClient.getNameByPost("酷儿");
        User user = new User();
        user.setUsername("你很酷");
        String result3 = nameApiClient.getUserNameByPost(user);
//        System.out.println(result1);
//        System.out.println(result2);
        System.out.println(result3);
    }
}
