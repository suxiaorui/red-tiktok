package com.rui.controller;

import com.rui.base.BaseInfoProperties;
import com.rui.bo.CommentBO;
import com.rui.grace.result.GraceJSONResult;
import com.rui.service.CommentService;
import com.rui.vo.CommentVO;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
public class CommentController extends BaseInfoProperties {

    @Autowired
    private CommentService commentService;

    @GetMapping("create")
    public Object create(@RequestBody @Valid CommentBO commentBO) throws  Exception{

        CommentVO commentVO = commentService.createComment(commentBO);
        return GraceJSONResult.ok(commentVO);

    }

    @GetMapping("counts")
    public GraceJSONResult counts(@RequestParam String vlogId) {

        String countsStr = redis.get(REDIS_VLOG_COMMENT_COUNTS + ":" + vlogId);
        if (StringUtils.isBlank(countsStr)) {
            countsStr = "0";
        }

        return GraceJSONResult.ok(Integer.valueOf(countsStr));
    }

    @GetMapping("list")
    public GraceJSONResult list(@RequestParam String vlogId,
                                @RequestParam(defaultValue = "") String userId,
                                @RequestParam Integer page,
                                @RequestParam Integer pageSize) {

        return GraceJSONResult.ok(
                commentService.queryVlogComments(
                        vlogId,
                        userId,
                        page,
                        pageSize));
    }


    @DeleteMapping("delete")
    public GraceJSONResult delete(@RequestParam String commentUserId,
                                  @RequestParam String commentId,
                                  @RequestParam String vlogId) {
        commentService.deleteComment(commentUserId,
                commentId,
                vlogId);
        return GraceJSONResult.ok();
    }
}
