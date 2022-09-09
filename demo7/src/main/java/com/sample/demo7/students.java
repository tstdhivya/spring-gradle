package com.sample.demo7;

import org.springframework.web.bind.annotation.*;

@RestController

public class students {
    String name;

    @GetMapping("/students")
    public String getName() {
        return this.name;
    }

    @PostMapping("/students")
    public String saveName(@RequestBody String _name) {
        this.name = _name;
        return "success";
    }

    @PutMapping("/students")
    public String updateName(@RequestBody String name) {
        this.name = "hello" + name;
        return name;
    }
}


