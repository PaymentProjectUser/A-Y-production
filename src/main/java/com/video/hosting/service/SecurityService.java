package com.video.hosting.service;

import com.video.hosting.model.SocialUserDto;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;

public interface SecurityService {
    SocialUserDto getPrincipal(OAuth2AuthenticationToken token);
}
