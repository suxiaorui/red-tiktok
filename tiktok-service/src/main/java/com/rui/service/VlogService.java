package com.rui.service;

import com.rui.bo.VlogBO;
import com.rui.utils.PagedGridResult;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/7/29 10:04
 * @Version 1.0
 */
public interface VlogService {

    /**
     * 新增vlog视频
     */
    public void createVlog(VlogBO vlogBO);

    /**
     * 查询首页/搜索的vlog列表
     */
    public PagedGridResult getIndexVlogList(String userId,
                                            String search,
                                            Integer page,
                                            Integer pageSize);
}
