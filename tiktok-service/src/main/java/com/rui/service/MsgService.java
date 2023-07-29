package com.rui.service;

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
}
