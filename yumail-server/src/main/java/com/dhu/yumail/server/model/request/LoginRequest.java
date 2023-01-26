package com.dhu.yumail.server.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 登录请求
 */
@Data
public class LoginRequest implements Serializable {

    private String username;

    private String password;
}
