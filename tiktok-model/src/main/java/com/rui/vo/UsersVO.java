package com.rui.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;


@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UsersVO implements Serializable {
    @Id
    private String id;
    private String mobile;
    private String nickname;
    @Column(name = "imooc_num")
    private String imoocNum;
    private String face;
    private Integer sex;
    private Date birthday;
    private String country;
    private String province;
    private String city;
    private String district;
    private String description;
    @Column(name = "bg_img")
    private String bgImg;
    @Column(name = "can_imooc_num_be_updated")
    private Integer canImoocNumBeUpdated;
    @Column(name = "created_time")
    private Date createdTime;
    @Column(name = "updated_time")
    private Date updatedTime;
    private static final long serialVersionUID = 1L;



    private String userToken;     //用户token  传递给前端

    private Integer myFollowsCounts;   // 我关注的博主总数
    private Integer myFansCounts;      // 我的粉丝总数
    private Integer myLikedVlogCounts;
    private Integer totalLikeMeCounts;     // 获赞总数


}