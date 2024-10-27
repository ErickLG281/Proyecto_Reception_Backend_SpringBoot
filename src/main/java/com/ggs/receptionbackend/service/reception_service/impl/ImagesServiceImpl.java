package com.ggs.receptionbackend.service.reception_service.impl;

import com.ggs.receptionbackend.entity.reception_information.Images;
import com.ggs.receptionbackend.repository.reception_repository.ImagesRepository;
import com.ggs.receptionbackend.service.reception_service.ImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImagesServiceImpl implements ImagesService {


    @Autowired
    private ImagesRepository imagesRepository;


    @Override
    public Images searchImagesById(Long id) {
        return imagesRepository.findById(id).orElse(null);
    }

    @Override
    public Images createImages(Images images) {
        images.setUrlImage(images.getUrlImage());
        return imagesRepository.save(images);
    }

    @Override
    public Images updateImages(Long id, Images images) {
        Images newImages = imagesRepository.findById(id).orElse(null);
        if (newImages != null) {
            newImages.setUrlImage(images.getUrlImage());
            return imagesRepository.save(newImages);
        }
        return null;
    }

    @Override
    public void deleteImages(Long id) {
        imagesRepository.deleteById(id);
    }

    @Override
    public List<Images> searchImagesByReceptionId(Long receptionId) {
        return imagesRepository.findByCompany_CompanyId(receptionId);
    }

}
