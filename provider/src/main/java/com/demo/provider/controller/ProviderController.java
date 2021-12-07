package com.demo.provider.controller;

import com.demo.provider.entity.UserInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ProviderController {

    @PostMapping("/provider/userInfo")
    public UserInfo providerByUserInfo() {
        return new UserInfo();
    }

}
