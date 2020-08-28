package com.pat.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description: {@link DiscoveryClient} {@link RestController}
 * @Author <a href="mailto:zfy_zang@163.com">Vincent</a>
 * @Create 2020/8/27
 * @Modify
 * @since
 */
@RestController
public class DiscoveryClientController {

    private final DiscoveryClient discoveryClient;
    private final String currentApplicationName;

    @Autowired
    public DiscoveryClientController(DiscoveryClient discoveryClient, @Value("${spring.application.name}") String currentApplicationName) {
        this.discoveryClient = discoveryClient;
        this.currentApplicationName = currentApplicationName;
    }

    /**
     * 获取当前应用信息
     * @return
     */
    @GetMapping("/current/service-instance")
    public ServiceInstance getCurrentServiceInstance() {
        return discoveryClient.getInstances(currentApplicationName).get(0);
    }

    /**
     * 获取所用应用名
     * @return
     */
    @GetMapping("/list/services")
    public List<String> listServices() {
        return discoveryClient.getServices();
    }

    /**
     * 获取所有的服务实例信息
     * @return
     */
    @GetMapping("/list/service-instances")
    public List<ServiceInstance> listServiceInstances() {
        List<String> services = listServices();
        List<ServiceInstance> serviceInstances = new LinkedList<>();
        services.forEach(serviceName -> {
            serviceInstances.addAll(discoveryClient.getInstances(serviceName));
        });
        return serviceInstances;
    }
}
