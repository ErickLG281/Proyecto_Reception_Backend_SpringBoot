package com.ggs.receptionbackend.service.reception_service;

import com.ggs.receptionbackend.entity.reception_information.Images;

import java.util.List;

public interface ImagesService {
    Images searchImagesById(Long id);
    Images createImages(Images images);
    Images updateImages(Long id, Images images);
    void deleteImages(Long id);

    List<Images> searchImagesByReceptionId(Long receptionId);
}
