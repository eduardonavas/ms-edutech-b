package br.com.tlf.edutech.msedutechb.configuration.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashSet;
import java.util.Set;

@Configuration
public class BillIdRepo {

    @Bean
    public Set<String> billIdRepoCache(){
        return new HashSet<>();
    }
}
