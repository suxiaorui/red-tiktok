package com.rui.service;

import com.rui.bo.VlogBO;
import com.rui.utils.PagedGridResult;
import com.rui.vo.IndexVlogVO;

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

    /**
     * 根据视频主键查询vlog
     */
    public IndexVlogVO getVlogDetailById(String userId, String vlogId);

    /**
     * 用户把视频改为公开/私密的视频
     */
    public void changeToPrivateOrPublic(String userId,
                                        String vlogId,
                                        Integer yesOrNo);

    /**
     * 查询用的公开/私密的视频列表
     */
    public PagedGridResult queryMyVlogList(String userId,
                                           Integer page,
                                           Integer pageSize,
                                           Integer yesOrNo);


    /**
     * 用户点赞/喜欢视频
     */
    public void userLikeVlog(String userId, String vlogId);



}
