package com.loginpage.loginpage.Service;

import com.loginpage.loginpage.Dto.LoginDto;
import com.loginpage.loginpage.Entity.LogIn;
import com.loginpage.loginpage.Repository.LoginRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {
@Autowired
    LoginRespository loginRespository;

public LogIn PostAll(LoginDto loginDto){
    LogIn logIn=new LogIn();
    logIn.setUsername(loginDto.getUsername());
    logIn.setPassword(loginDto.getPassword());
    return  loginRespository.save(logIn);
}

public List<LogIn> SendAll(){
    return loginRespository.findAll();
}
}
