package com.cool.project.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cool.project.common.ErrorCode;
import com.cool.project.exception.BusinessException;
import com.cool.project.mapper.UserInterfaceInfoMapper;
import com.cool.project.service.UserInterfaceInfoService;
import com.cool.turboapicommon.model.entity.UserInterfaceInfo;
import org.springframework.stereotype.Service;

/**
 * @author Cool
 * @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service实现
 * @createDate 2024-09-01 14:03:12
 */
@Service
public class UserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo>
        implements UserInterfaceInfoService {
    @Override
    public void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add) {
        if (userInterfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }

        // 创建时，所有参数必须非空
        if (add) {
            if (userInterfaceInfo.getInterfaceInfoId() <= 0 || userInterfaceInfo.getUserId() <= 0) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR, "接口或用户不存在");
            }
        }
        if (userInterfaceInfo.getLeftNum() < 0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "剩余次数不能小于 0");
        }

    }

    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        //判断
        if (interfaceInfoId <= 0 || userId <= 0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        //使用UpdateWrapper对象来构建更新条件
        UpdateWrapper<UserInterfaceInfo> updateWrapper = new UpdateWrapper<>();
        //在updateWrapper 中设置了两个条件：interfaceInfoId 和 userId
        updateWrapper.eq("interfaceInfoId", interfaceInfoId);
        updateWrapper.eq("userId", userId);
        //setSql 方法用于设置要更新的字段，这里使用了一个内置函数，用于更新剩余调用次数和总调用次数
        updateWrapper.setSql("leftNum = leftNum - 1,totalNum = totalNum+1");
        return this.update(updateWrapper);
    }

}




