package com.video.hosting.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SocialUserDto {
    private Integer id;

    private String name;

    private String userPic;

    private String email;
}
