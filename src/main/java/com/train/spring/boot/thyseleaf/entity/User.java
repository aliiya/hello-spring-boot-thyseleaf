package com.train.spring.boot.thyseleaf.entity;

import java.io.Serializable;

/**
 * @Author: aliya
 * @Description:
 * @Data: Create in 2019/10/10 16:45
 * @Modify By:
 */
public class User implements Serializable {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
