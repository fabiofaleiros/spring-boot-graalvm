package tech.ffs.springbootgraalvm.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GraalController {

    @GetMapping
    public ResponseEntity<String> hellGraal() {
        return ResponseEntity.ok("Hello GraalVM");
    }
}
