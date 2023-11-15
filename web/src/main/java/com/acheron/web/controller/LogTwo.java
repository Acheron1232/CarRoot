package com.acheron.web.controller;

import com.acheron.service.dto.security.JwtRequest;
import com.acheron.service.dto.security.JwtResponse;
import com.acheron.service.service.UsersService;
import com.acheron.web.util.JwtTokenUtils;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/zxc")
@RequiredArgsConstructor
public class LogTwo {
    private final AuthenticationManager authenticationManager;
    private final UsersService service;
    private final JwtTokenUtils tokenUtils;

    @PostMapping("/loginn")
    public ResponseEntity<?> resp(HttpServletRequest request1){

        JwtRequest request = new JwtRequest();
        request.setUsername(request1.getParameter("username"));
        request.setPassword(request1.getParameter("password"));
        System.out.println(request);
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(),request.getPassword()));
        }catch (BadCredentialsException e){
            return ResponseEntity.ok("далбаеб пароль не той мб нік");
        }
        UserDetails userDetails = service.loadUserByUsername(request.getUsername());
        String token = tokenUtils.generateToken(userDetails);
        return ResponseEntity.ok(token);
    }
}
