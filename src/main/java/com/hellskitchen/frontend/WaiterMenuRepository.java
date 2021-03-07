package com.hellskitchen.frontend;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class WaiterMenuRepository implements MenuRepository {

    private static final String PROTOCOL = "http";
    private static final String HOST = "localhost";
    private static final int PORT = 8080;
    private final RestTemplate restTemplate;

    public WaiterMenuRepository(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public Menu get() {
        String url = String.format("%s://%s:%s/menu",PROTOCOL, HOST, PORT);
        return restTemplate.getForObject(url, Menu.class);
    }
}
