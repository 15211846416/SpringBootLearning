package com.example.springbootelasticsearch.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Yi
 * @date 2020/7/4 19:36
 */
@Configuration
public class ElasticSearchConfig {

    @Bean
   public RestHighLevelClient restHighLevelClient(){

    }



}
