package com.example.service2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ApiTwoController {

    @GetMapping(value = "/openmarket/main")
    public String services() {
        return String.format("openmarket/main API Port : %s", "8012");
    }

    // message 메서드 추가
    @GetMapping("/openmarket/message")
    public String message(@RequestHeader("second-request") String header) {
        log.info(header);
        return "Hello World in Service2.";
    }

}
