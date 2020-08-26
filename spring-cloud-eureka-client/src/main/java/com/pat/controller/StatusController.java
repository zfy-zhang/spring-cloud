package com.pat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 状态控制器
 * @Author <a href="mailto:zfy_zang@163.com">Vincent</a>
 * @Create 2020/8/26
 * @Modify
 * @since
 */
@RestController
public class StatusController {

    @GetMapping("/status")
    public String status() {
        return "OK";
    }
}
