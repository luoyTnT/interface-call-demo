package com.demo.provider.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserInfo {

    private Long id;

    private String userName;

    private Integer age;

    private String gender;

    private String phone;

    private String email;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    public UserInfo() {
        this.setId(1L);
        this.setUserName("张三");
        this.setAge(30);
        this.setGender("男");
        this.setPhone("13111111111");
        this.setEmail("zs@g.com");
        this.setCreateTime(LocalDateTime.parse(getTime()));
        this.setUpdateTime(LocalDateTime.now());
    }

    @JsonIgnore
    private final String time = "2021-12-07T11:40:20.72";

}
