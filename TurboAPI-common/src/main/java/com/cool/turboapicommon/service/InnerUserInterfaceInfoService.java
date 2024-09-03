package com.cool.turboapicommon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cool.turboapicommon.model.entity.UserInterfaceInfo;

/**
* @author Cool
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-09-01 14:03:12
*/
public interface InnerUserInterfaceInfoService extends IService<UserInterfaceInfo> {
    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
