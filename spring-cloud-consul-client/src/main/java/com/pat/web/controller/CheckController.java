package com.pat.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 检查 Controller
 * @Author <a href="mailto:zfy_zang@163.com">Vincent</a>
 * @Create 2020/8/27
 * @Modify
 * @since
 */
@RestController
public class CheckController {

    @GetMapping("/check")
    public String check() {
        return "OK";
    }

}
