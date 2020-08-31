package com.pat.web.controller;

import com.pat.domain.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: Service Provider {@link RestController}
 * @Author <a href="mailto:zfy_zang@163.com">Vincent</a>
 * @Create 2020/8/28
 * @Modify
 * @since
 */
@RestController
public class ServiceProviderController {

    @PostMapping("/greeting")
    public String greeting(@RequestBody User user) {
        return "Greeting, " + user;
    }
}
