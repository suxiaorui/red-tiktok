package com.rui.mapper;

import com.rui.vo.IndexVlogVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/7/29 10:21
 * @Version 1.0
 */
@Repository
public interface VlogMapperCustom {

    public List<IndexVlogVO> getIndexVlogList(@Param("paramMap") Map<String, Object> map);
    public List<IndexVlogVO> getVlogDetailById(@Param("paramMap")Map<String, Object> map);

}
