package com.ggs.receptionbackend.DTO;

import com.ggs.receptionbackend.entity.reception_information.Images;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
public class ReceptionDTO {
    private String name;
    private String location;
    private int phoneNumber;

    private BigDecimal initialPrice;
    private int maxQuantity;
    private int minQuantity;
    private String description;

    private double rating;

    private List<Images> images;
}
