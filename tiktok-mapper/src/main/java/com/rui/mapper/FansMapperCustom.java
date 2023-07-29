package com.rui.mapper;

import com.rui.vo.VlogerVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/7/29 15:47
 * @Version 1.0
 */
@Repository
public interface FansMapperCustom {

    public List<VlogerVO> queryMyFollows(@Param("paramMap") Map<String, Object> map);

}
