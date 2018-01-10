package com.aanorbel.springcloudeurekaclient

import org.springframework.web.bind.annotation.GetMapping

interface GreetingController {
    @GetMapping("/greeting")
    String greeting()
}