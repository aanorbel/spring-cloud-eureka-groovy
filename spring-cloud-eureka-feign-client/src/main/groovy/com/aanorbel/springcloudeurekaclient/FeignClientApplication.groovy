package com.aanorbel.springcloudeurekaclient

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.feign.EnableFeignClients
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RestController
class FeignClientApplication {

    @Autowired
    private GreetingClient greetingClient


    static void main(String[] args) {
        SpringApplication.run FeignClientApplication, args
    }

    @GetMapping("/get-greeting")
    String greeting() {
        return "greeting-view ${greetingClient.greeting()}"
    }
}
