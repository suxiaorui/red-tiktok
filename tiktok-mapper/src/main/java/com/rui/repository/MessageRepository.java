package com.rui.repository;

import com.rui.mo.MessageMO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/7/30 1:42
 * @Version 1.0
 */
@Repository
public interface MessageRepository extends MongoRepository<MessageMO, String> {
}
