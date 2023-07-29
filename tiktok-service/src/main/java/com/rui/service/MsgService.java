package com.rui.service;

import com.rui.mo.MessageMO;

import java.util.List;
import java.util.Map;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/7/30 1:40
 * @Version 1.0
 */
public interface MsgService {

    /**
     * 创建消息
     */
    public void createMsg(String fromUserId,
                          String toUserId,
                          Integer type,
                          Map msgContent);

    /**
     * 查询消息列表
     */
    public List<MessageMO> queryList(String toUserId,
                                     Integer page,
                                     Integer pageSize);
}
