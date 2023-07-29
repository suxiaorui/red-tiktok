package com.rui.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/7/29 15:44
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class VlogerVO {
    private String vlogerId;
    private String nickname;
    private String face;
    private boolean isFollowed = true;
}