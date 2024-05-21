package org.dbp.hackaton1.user.application;

import org.dbp.hackaton1.user.domain.User;
import org.dbp.hackaton1.user.domain.UserService;
import org.dbp.hackaton1.user.infrastructure.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    public UserService userService;

    //POST /usuarios/register
    @PostMapping("/register")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.createStudent(user));
    }

}
