package com.example.demo.controller;

import com.example.demo.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2019/1/8 0008.
 */
@RestController
public class MovieController {
    private static final Logger logger = LoggerFactory.getLogger(MovieController.class);


    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/user/{id}")
    public User findOne(@PathVariable("id") long id){
        //return this.restTemplate.getForObject("http://localhost:8000/" + id, User.class);
        return this.restTemplate.getForObject("http://provider/" + id, User.class);
    }


    @GetMapping("/log_user_instance")
    public void logUserInstance() {
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("provider");
        MovieController.logger.info("{}:{};{}",serviceInstance.getServiceId(),serviceInstance.getHost(),serviceInstance.getPort());
    }

}
