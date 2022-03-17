package com.intuit.logger.service2.controller;


import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/service2")
@Slf4j
public class ServiceController {

    @GetMapping(path = "/success")
    @Operation(description = "Success call")
    public ResponseEntity<String> successCall(HttpServletRequest request) {
        log.info("Starting request - success");
        log.info("Completed request - success");
        return ResponseEntity.ok("Success");
    }

    @GetMapping(path = "/fail")
    @Operation(description = "Failure call")
    public ResponseEntity<String> failureCall(HttpServletRequest request) {
        log.info("Starting request - fail");
        log.info("Completed request - fail");
        return ResponseEntity.ok("Success");
    }
}
