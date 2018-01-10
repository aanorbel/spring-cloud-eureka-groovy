package com.aanorbel.springcloudeurekaclient

import com.netflix.discovery.EurekaClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
@EnableEurekaClient
class SpringCloudEurekaClientApplication implements GreetingController {

    @Autowired
    @Lazy
    EurekaClient eurekaClient
    @Value('${spring.application.name}')
    String appName


    static void main(String[] args) {
        SpringApplication.run SpringCloudEurekaClientApplication, args
    }

    @Override
    String greeting() {
        "Hello from ${eurekaClient.getApplication(appName).getName()} !"
    }
}
