package com.cool.turboapicommon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cool.turboapicommon.model.entity.InterfaceInfo;

public interface InnerInterfaceInfoService {
    /**
     * 查询接口是否存在
     * @param path 请求路径
     * @param method 请求方法
     * @return 接口信息
     */
    InterfaceInfo getInterfaceInfo(String path, String method);
}
