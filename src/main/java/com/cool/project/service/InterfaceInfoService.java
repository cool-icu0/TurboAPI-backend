package com.cool.project.service;

import com.cool.turboapicommon.model.entity.InterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Cool
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-08-11 21:54:53
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
