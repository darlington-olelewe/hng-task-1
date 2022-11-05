package com.hngintern.controller;

import com.hngintern.model.Request;
import com.hngintern.model.Response;
import com.hngintern.service.OperationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "api")
public class OperationController {
    private final OperationService operationService;
    @PostMapping("/operation")
    public ResponseEntity<Response> operation(@RequestBody Request request) {
        return ResponseEntity.ok(operationService.operation(request));
    }
}
