package com.rui.service;

import com.rui.utils.PagedGridResult;

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


    /**
     * 查询我关注的博主列表
     */
    public PagedGridResult queryMyFollows(String myId,
                                          Integer page,
                                          Integer pageSize);

}
