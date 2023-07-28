package com.rui.controller;

import com.rui.grace.result.GraceJSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/7/28 9:24
 * @Version 1.0
 */

@Slf4j
@Api(tags = "Hello 测试的接口")
@RestController
public class HelloController {

    @ApiOperation(value = "hello-这是一个hello的测试路由")
    @GetMapping("hello")
    public Object hello(){
        return GraceJSONResult.ok("hello");
    }
}
