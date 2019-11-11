package com.js.avangers.repository;

import com.js.avangers.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserRepository extends ElasticsearchRepository<User, String> {

    User findByUsername(String username);
}
