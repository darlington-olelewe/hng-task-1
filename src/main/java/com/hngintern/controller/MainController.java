package com.hngintern.controller;

import com.hngintern.model.Info;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class MainController {

    @GetMapping("/info")
    public ResponseEntity<Info> getBasicInfo(){
        Info info = Info.builder()
                .slackUsername("xpressrules")
                .backend(true)
                .age(25)
                .bio("Fullstack Software Engineer with proficiency in Java backend development, having experience building and developing aesthetic products to satisfy user requirements, testing software products, and providing IT support to team members.")
                .build();
        return ResponseEntity.ok(info);
    }
}
