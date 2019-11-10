package com.js.avangers.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories
public class ElasticsearchConfig {

    @Value("${elasticsearch.host}")
    private String elasticsearchHost;

    @Value("${elasticsearch.port}")
    private int elasticsearchPort;

    @Bean
    public RestHighLevelClient client() {

        ClientConfiguration clientConfiguration = ClientConfiguration.builder()
                .connectedTo(elasticsearchHost + ":" + elasticsearchPort,
                        elasticsearchHost + ":" + elasticsearchPort)
                .build();

        return RestClients.create(clientConfiguration).rest();
    }
}
