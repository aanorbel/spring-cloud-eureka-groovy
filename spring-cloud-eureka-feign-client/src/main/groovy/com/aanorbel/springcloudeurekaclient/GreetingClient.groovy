package com.aanorbel.springcloudeurekaclient

import org.springframework.cloud.netflix.feign.FeignClient

@FeignClient("spring-cloud-eureka-client")
interface GreetingClient extends GreetingController {
}