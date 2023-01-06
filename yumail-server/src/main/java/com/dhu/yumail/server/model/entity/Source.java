package com.dhu.yumail.server.model.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * 调度源
 * @author Yupi Li
 * @date 19/03/15
 */
@Data
@Component
public class Source implements Serializable {

    /**
     * 项目名，作为本地源key
     */
    private String appId;

    /**
     * 邮件服务器
     */
    private String host;

    /**
     * 发送方邮箱地址
     */
    private String username;

    /**
     * 调度源url
     */
    private String url;

    /**
     * 启动时间
     */
    private Date startTime = new Date();

    private static final long serialVersionUID = -7011290275941486363L;

}
