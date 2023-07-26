package com.video.hosting.controller;

import com.video.hosting.model.SocialUserDto;
import com.video.hosting.service.SecurityService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/auth")
@AllArgsConstructor
public class AuthorizationController {

    private final SecurityService securityService;

    @GetMapping
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Test");
    }

    @GetMapping("/principal")
    public SocialUserDto currentUser(OAuth2AuthenticationToken token) {
        return securityService.getPrincipal(token);
    }
}
