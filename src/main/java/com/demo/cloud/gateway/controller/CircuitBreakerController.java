package com.demo.cloud.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class CircuitBreakerController {

    private static final String RESILIENCE4J_INSTANCE_NAME = "service";
    private static final String FALLBACK_METHOD = "fallback";


}
