package com.rui.mapper;

import com.rui.my.mapper.MyMapper;
import com.rui.pojo.Comment;

import org.springframework.stereotype.Repository;

@Repository
public interface CommentMapper extends MyMapper<Comment> {
}