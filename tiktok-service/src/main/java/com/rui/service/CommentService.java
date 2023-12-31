package com.rui.service;

import com.rui.bo.CommentBO;
import com.rui.pojo.Comment;
import com.rui.utils.PagedGridResult;
import com.rui.vo.CommentVO;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/7/30 0:19
 * @Version 1.0
 */
public interface CommentService {

    /**
     * 发表评论
     */
    public CommentVO createComment(CommentBO commentBO);

    /**
     * 查询评论的列表
     */
    public PagedGridResult queryVlogComments(String vlogId,
                                             String userId,
                                             Integer page,
                                             Integer pageSize);

    /**
     * 删除评论
     */
    public void deleteComment(String commentUserId,
                              String commentId,
                              String vlogId);

    /**
     * 根据主键查询comment
     */
    public Comment getComment(String id);
}
