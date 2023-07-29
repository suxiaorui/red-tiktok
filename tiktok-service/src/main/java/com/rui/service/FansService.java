package com.rui.service;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/7/29 13:41
 * @Version 1.0
 */
public interface FansService {

    /**
     * 关注
     */
    public void doFollow(String myId, String vlogerId);

    /**
     * 取关
     */
    public void doCancel(String myId, String vlogerId);

    /**
     * 查询用户是否关注博主
     */
    public boolean queryDoIFollowVloger(String myId, String vlogerId);

}
