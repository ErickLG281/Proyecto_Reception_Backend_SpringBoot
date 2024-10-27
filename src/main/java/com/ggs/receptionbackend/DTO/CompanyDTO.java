package com.ggs.receptionbackend.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompanyDTO {
    private String nameCompany;
    private String emailCompany;
    private int phoneNumber;

    private String fullName;
    private String emailUser;
    private String password;

}
