package com.qklx.qt.admin.service;

import com.baomidou.mybatisplus.service.IService;
import com.qklx.qt.admin.entity.User;
import com.qklx.qt.core.api.ApiResult;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author yang
 * @since 2019-04-08
 */
public interface UserService extends IService<User> {

    /**
     * simple登录
     * @param params
     * @return
     */
    ApiResult login(User params);


    ApiResult info(String token);

    ApiResult logout();
}
