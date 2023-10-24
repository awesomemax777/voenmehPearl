package com.voenmeh.voenmehpearl.dao.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignUpRequest {
    private String email;
    private String userName;
    private String password;
}
