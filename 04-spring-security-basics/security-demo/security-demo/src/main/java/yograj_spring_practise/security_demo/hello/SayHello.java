package yograj_spring_practise.security_demo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SayHello {

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "helloJi! Ap kaise hain";
    }

    @RequestMapping("admin")
    @ResponseBody
    public String admin(){
        return "Welcome Admin";
    }
}


