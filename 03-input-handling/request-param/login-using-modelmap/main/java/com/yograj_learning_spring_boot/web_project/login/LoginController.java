package com.yograj_learning_spring_boot.web_project.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping("login")
    public String goToLoginPage(@RequestParam String name, ModelMap map){
 map.put("name",name);
        System.out.println("Requested name is:"+ name);
        return "login";
    }
}
