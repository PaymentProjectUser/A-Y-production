package com.video.hosting.mapper;

import com.video.hosting.model.SocialUserDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import java.util.Map;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    default SocialUserDto mapSocialUserFromOauth2Data(Map<String, Object> oauth2Data) {
        return SocialUserDto.builder()
                .id((Integer) (oauth2Data.get("id")))
                .userPic((String) oauth2Data.get("avatar_url"))
                .email((String) oauth2Data.get("email"))
                .name((String) oauth2Data.get("login"))
                .build();
    }
}
