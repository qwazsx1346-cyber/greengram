package com.green.greengram.application.feed;

import com.green.greengram.application.feed.model.FeedPostReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FeedMapper {
    int save(FeedPostReq req); //insert, update, delect는 int또는 void만 적을 수 있다. select빼고는 모두 다 int(영향받은 행 수 밖에 들어갈수없기때문에)
}
