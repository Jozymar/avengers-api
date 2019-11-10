package com.js.avangers.repository;

import com.js.avangers.domain.Avanger;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface AvangerRepository extends ElasticsearchRepository<Avanger, String> {
}
