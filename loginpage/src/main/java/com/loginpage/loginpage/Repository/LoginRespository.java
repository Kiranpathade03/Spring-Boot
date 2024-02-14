package com.loginpage.loginpage.Repository;

import com.loginpage.loginpage.Entity.LogIn;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRespository extends JpaRepository<LogIn , Integer> {
}
