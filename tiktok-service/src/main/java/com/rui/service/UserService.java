package com.rui.service;

import com.rui.pojo.Users;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/7/28 17:07
 * @Version 1.0
 */
public interface UserService {

    /**
     * 判断用户是否存在，如果存在则返回用户信息
     */
    public Users queryMobileIsExist(String mobile);

    /**
     * 创建用户信息，并且返回用户对象
     */
    public Users createUser(String mobile);


}
