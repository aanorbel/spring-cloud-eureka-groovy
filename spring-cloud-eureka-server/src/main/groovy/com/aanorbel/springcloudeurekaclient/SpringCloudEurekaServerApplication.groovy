package com.aanorbel.springcloudeurekaclient

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
@EnableEurekaServer
class SpringCloudEurekaServerApplication {


    static void main(String[] args) {
        SpringApplication.run SpringCloudEurekaServerApplication, args
    }
}
