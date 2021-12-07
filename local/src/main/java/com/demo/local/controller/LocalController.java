package com.demo.local.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class LocalController {

    @GetMapping("/local/userInfo")
    public Object getProviderUserInfo() {
        String providerUrl = "http://127.0.0.1:10001";
        String providerMethod = "/provider/userInfo";

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();

        LinkedMultiValueMap<String, Object> map = new LinkedMultiValueMap<>();

        HttpEntity<LinkedMultiValueMap<String, Object>> request = new HttpEntity<>(map, headers);

        ResponseEntity<String> response = restTemplate.postForEntity(providerUrl + providerMethod, request, String.class);

        return response.getBody();
    }

}
