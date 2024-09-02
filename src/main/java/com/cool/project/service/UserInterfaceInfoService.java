package com.cool.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cool.project.model.entity.UserInterfaceInfo;

/**
* @author Cool
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-09-01 14:03:12
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {
    /**
     * 验证接口调用信息
     * @param userInterfaceInfo
     * @param add
     */
    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);
    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
