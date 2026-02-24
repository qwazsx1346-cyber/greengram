package com.green.greengram.application.feedcomment;

import com.green.greengram.application.feedcomment.model.FeedCommentPostReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FeedCommentMapper {
    long save(FeedCommentPostReq req);
}
