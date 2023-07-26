package com.video.hosting.service.impl;

import com.video.hosting.mapper.UserMapper;
import com.video.hosting.model.SocialUserDto;
import com.video.hosting.service.SecurityService;
import lombok.AllArgsConstructor;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SecurityServiceImpl implements SecurityService {
    private final UserMapper userMapper;

    @Override
    public SocialUserDto getPrincipal(OAuth2AuthenticationToken token) {
        return userMapper.mapSocialUserFromOauth2Data(token.getPrincipal().getAttributes());
    }
}
