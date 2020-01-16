package com.dh;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Main {

    @RequestMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("text", "DH Spring Page.<br/>Comming soon.");
        return "index";
    }

    @RequestMapping(value = "/json", produces = "application/json")
    @ResponseBody
    public Object json() {
        Map<String, String> map = new HashMap<>();
        map.put("text", "DH Spring. json test");
        return map;
    }
}
