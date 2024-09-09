package org.tao;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/user/register")
    public User registerPost(
            @RequestBody User user
    ) {
        System.out.println(
                "Registering user with firstName: " + user.getFirstName()
                        + ", lastName: " + user.getLastName()
                        + ", email: " + user.getEmail()
                        + ", addressLine: " + user.getAddress().getAddressLine()
                        + ", city: " + user.getAddress().getCity()
                        + ", postalCode: " + user.getAddress().getPostalCode()
        );
        return user;
    }
}