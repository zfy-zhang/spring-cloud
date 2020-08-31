package com.pat.web.controller;

import com.pat.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: Client {@link RestController}
 * @Author <a href="mailto:zfy_zang@163.com">Vincent</a>
 * @Create 2020/8/28
 * @Modify
 * @since
 */
@RestController
public class ClientController {

    private RestTemplate restTemplate;

    @Value("${service-provider.host}")
    private String serviceProviderHost;

    @Value("${service-provider.port}")
    private Integer serviceProviderPort;

    @Autowired
    public ClientController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("")
    public String index() {
        User user = new User();
        user.setId(1L);
        user.setName("pat");
        return restTemplate.postForObject("http://localhost:9090/greeting",
                user, String.class);
//        return restTemplate.postForObject("http://" +
//                        serviceProviderHost + ":" + serviceProviderPort +
//                        "/greeting",
//                user, String.class);
    }


}
