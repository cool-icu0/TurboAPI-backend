package com.cool.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cool.project.mapper.UserInterfaceInfoMapper;
import com.cool.project.model.entity.UserInterfaceInfo;
import com.cool.project.service.UserInterfaceInfoService;
import org.springframework.stereotype.Service;

/**
* @author Cool
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service实现
* @createDate 2024-09-01 14:03:12
*/
@Service
public class UserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo>
    implements UserInterfaceInfoService {

}




