package com.peaksoft.springbootrestapi.dto;

import com.peaksoft.springbootrestapi.entity.User;
import org.springframework.stereotype.Component;

@Component
public class LoginMapper {
    public LoginResponse view(String token, String message, User user){
       LoginResponse response = new LoginResponse();
       response.setToken(token);
       response.setMessage(message);

       if(user != null){
           response.setAuthority(user.getRole().getAuthority());
       }
       return response;
    }
}
