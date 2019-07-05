package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;


@Controller
public class TestController
{
    //@GetMapping("/index")
    public Map<String, String> index()
    {
        Map<String, String> result = new HashMap<>();
        result.put("test1", "test1");
        result.put("test2", "test2");
        result.put("test3", "test3");
        return result;
    }
}