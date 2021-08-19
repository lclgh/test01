package com.test.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String test1(){
        return "hello world! springboot!";
    }

    @PostMapping("/posthello")
    public String test2(){
        return "post! springboot!";
    }

    @DeleteMapping("/deletehello")
    public String test3(){
        return "delete! springboot!";
    }

    @GetMapping("/param/{abc}/{def}")
    // 数量要一致
    // 类型要一致
    // 就是用不一致的url攻击你 你怎么办？
    // Validtor 检查机制
    public String test4(@PathVariable String abc, @PathVariable String def){
        return "hello param get!" + abc + " : " +def;
    }

    @DeleteMapping("/param1/{userId}/{passwd}")
    // 数量要一致
    // 类型要一致
    // 就是用不一致的url攻击你 你怎么办？
    // Validtor 检查机制
    public String test5(@PathVariable String userId, @PathVariable String passwd){
        return "hello param get!" + userId + " : " + passwd;
    }
    @PutMapping("/param1/{userId}/{passwd}")
    // 数量要一致
    // 类型要一致
    // 就是用不一致的url攻击你 你怎么办？
    // Validtor 检查机制
    public String test6(@PathVariable("userId") String abcc, @PathVariable("passwd") String bbbb){
        return "hello param get!" + abcc + " : " + bbbb;
    }

    @GetMapping("/param9")
    public String test7(@RequestParam("userId") String abc, @RequestParam("abcdef") String passwd){
        return "hello param22 get!" + abc + " : " + passwd;
    }

    @GetMapping("/geterror")
    public String test8() throws  Exception{
        throw new Exception("test error");
    }
}