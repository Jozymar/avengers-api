package com.js.avangers.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(indexName = "avanger", type = "avanger")
public class Avanger implements Serializable {

    @Id
    private String id;

    private String nome;

    private String poder;

    private String cor;
}
