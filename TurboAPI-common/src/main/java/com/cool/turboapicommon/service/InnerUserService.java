package com.cool.turboapicommon.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.cool.turboapicommon.model.entity.User;


/**
 * 用户服务
 */
public interface InnerUserService{
    /**
     * 根据 accessKey 查询是否给用户分配秘钥
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);
}
