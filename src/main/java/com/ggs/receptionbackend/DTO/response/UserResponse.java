package com.ggs.receptionbackend.DTO.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponse {
    private String fullName;
    private String rolName;
}
