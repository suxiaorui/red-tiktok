package com.rui.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/7/29 10:23
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class IndexVlogVO {
    private String vlogId;
    private String vlogerId;
    private String vlogerFace;
    private String vlogerName;
    private String content;
    private String url;
    private String cover;
    private Integer width;
    private Integer height;
    private Integer likeCounts;
    private Integer commentsCounts;
    private Integer isPrivate;
    private boolean isPlay = false;
    private boolean doIFollowVloger = false;
    private boolean doILikeThisVlog = false;
}
