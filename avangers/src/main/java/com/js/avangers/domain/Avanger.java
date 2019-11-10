package com.js.avangers.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

@Data
@Builder
@Document(indexName = "avanger", type = "avanger")
public class Avanger implements Serializable {

    @Id
    private String id;

    private String nome;

    private String poder;

    private String cor;
}
