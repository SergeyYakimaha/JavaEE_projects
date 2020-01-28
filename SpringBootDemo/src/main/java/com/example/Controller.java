package com.example;

import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    @Autowired
    private User user;

    @GetMapping("/test")
    public @ResponseBody Map<String, Object> add() {
        final Map<String, Object> responseMap = new HashMap<>();

        responseMap.put("status", "success");
        responseMap.put("message", "Hello");
        responseMap.put("user_id", user.getId());
        responseMap.put("user_name", user.getName());

        return responseMap;
    }
}
