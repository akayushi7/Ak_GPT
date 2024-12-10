package AkGPT.Ak_GPT.Controller;


import AkGPT.Ak_GPT.model.User;
import AkGPT.Ak_GPT.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;

import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {


    @GetMapping("/success")
    public ResponseEntity<String> successPage() {
        return ResponseEntity.ok("You have successfully logged in!");
    }

    @GetMapping("/logout-success")
    public ResponseEntity<String> logoutPage() {
        return ResponseEntity.ok("You have been logged out.");
    }
}