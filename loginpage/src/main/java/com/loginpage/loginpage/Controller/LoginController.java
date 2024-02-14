package com.loginpage.loginpage.Controller;

import com.loginpage.loginpage.Dto.LoginDto;
import com.loginpage.loginpage.Entity.LogIn;
import com.loginpage.loginpage.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping("/login")
    public LogIn postData(@RequestBody LoginDto loginDto){
    return loginService.PostAll(loginDto);
    }

    @GetMapping("/getlogin")
    public List<LogIn> getAll(){
        return loginService.SendAll();
    }
}
