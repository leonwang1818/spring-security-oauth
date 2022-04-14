package org.lei.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Date: Created in 2022/4/12 23:10
 * @Author: WangLei
 * @Version: 1.0.0
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/admin/hello")
    @PreAuthorize("hasAnyRole('admin')")
    public String admin() {
        return "admin hello";
    }
}
