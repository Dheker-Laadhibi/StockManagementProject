package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Auth;
import com.example.demo.entities.LoginRequest;
import com.example.demo.service.ImplAuthService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/Login")
public class AuthController {


    @Autowired
    private ImplAuthService implAuthService;

    @CrossOrigin(origins = "http://localhost:4200")
    /*@PostMapping(path = "/signup")
    public Auth signUp(@RequestBody Auth auth) {

        return implAuthService.signUp(auth);
    }
*/

    @PostMapping(path = "/signup")
    public Auth signUp(@RequestBody Auth auth) {

        return implAuthService.signUp(auth);
    }

    @PostMapping("/authenticate")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        try {
            Auth user = implAuthService.login(loginRequest.getEmail(), loginRequest.getPassword());

            if (user != null) {
                Map<String, Object> response = new HashMap<>();
                response.put("user", user);
                response.put("message", "Login successful!");
                return ResponseEntity.ok(response);

            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials     !");
            }
        } catch (Exception e) {

            e.printStackTrace();

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error !");
        }
    }



    @GetMapping("/searchByCin/{cin}")
    public ResponseEntity<?> searchByCin(@PathVariable int cin) {
        try {
            Optional<Auth> user = implAuthService.findById(cin);

            if (user.isPresent()) {
                return ResponseEntity.ok(user.get());
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User with CIN " + cin + " not found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error !");
        }
    }

}