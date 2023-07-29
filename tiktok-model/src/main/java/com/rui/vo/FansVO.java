package com.rui.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/7/29 15:53
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FansVO {
    private String fanId;
    private String nickname;
    private String face;
    private boolean isFriend = false;
}
