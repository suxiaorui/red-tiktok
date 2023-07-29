package com.rui.controller;

import com.rui.bo.CommentBO;
import com.rui.grace.result.GraceJSONResult;
import com.rui.service.CommentService;
import com.rui.vo.CommentVO;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/7/30 0:18
 * @Version 1.0
 */

@Slf4j
@Api(tags = "CommentController 评论模块的接口")
@RequestMapping("comment")
@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("create")
    public Object create(@RequestBody @Valid CommentBO commentBO) throws  Exception{

        CommentVO commentVO = commentService.createComment(commentBO);
        return GraceJSONResult.ok(commentVO);

    }
}
