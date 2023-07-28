package com.rui.service.impl;

import com.rui.enums.Sex;
import com.rui.enums.YesOrNo;
import com.rui.mapper.UsersMapper;
import com.rui.pojo.Users;
import com.rui.service.UserService;
import com.rui.utils.DateUtil;
import com.rui.utils.DesensitizationUtil;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/7/28 17:07
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private Sid sid;
    private static final String USER_FACE1 = "https://up.enterdesk.com/edpic/f9/36/24/f936244e6c668f247a4a3e07f0610000.jpg";

    @Override
    public Users queryMobileIsExist(String mobile) {
        Example userExample = new Example(Users.class);
        Example.Criteria criteria = userExample.createCriteria();
        criteria.andEqualTo("mobile",mobile);
        Users users = usersMapper.selectOneByExample(userExample);
        return users;
    }

    @Transactional
    @Override
    public Users createUser(String mobile) {
        //获得全局唯一主键
        String userId = sid.nextShort();

        Users user = new Users();
        user.setId(userId);

        user.setMobile(mobile);
        user.setNickname("用户：" + DesensitizationUtil.commonDisplay(mobile));
        user.setImoocNum("用户：" + DesensitizationUtil.commonDisplay(mobile));
        user.setFace(USER_FACE1);

        user.setBirthday(DateUtil.stringToDate("1900-01-01"));
        user.setSex(Sex.secret.type);

        user.setCountry("中国");
        user.setProvince("");
        user.setCity("");
        user.setDistrict("");
        user.setDescription("这家伙很懒，什么都没留下~");
        user.setCanImoocNumBeUpdated(YesOrNo.YES.type);

        user.setCreatedTime(new Date());
        user.setUpdatedTime(new Date());

        usersMapper.insert(user);

        return null;
    }

}
