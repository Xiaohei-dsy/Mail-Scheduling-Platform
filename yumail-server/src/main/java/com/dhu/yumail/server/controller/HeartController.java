package com.dhu.yumail.server.controller;

import com.dhu.yumail.server.model.base.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 心跳检测控制器
 */
@RestController
@RequestMapping("/heart")
public class HeartController {

    /**
     * 心跳检测
     * @return
     */
    @GetMapping
    public Result<Integer> heartCheck() {
        return Result.success(1);
    }

}
