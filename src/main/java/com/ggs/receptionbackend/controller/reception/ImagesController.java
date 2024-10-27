package com.ggs.receptionbackend.controller.reception;

import com.ggs.receptionbackend.entity.reception_information.Images;
import com.ggs.receptionbackend.service.reception_service.ImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("images")
public class ImagesController {

    @Autowired
    private ImagesService imagesService;

    @GetMapping("/{receptionId}")
    public ResponseEntity<List<Images>> searchImagesByReceptionId(@PathVariable Long receptionId) {
        List<Images> imagesList = imagesService.searchImagesByReceptionId(receptionId);
        if (imagesList.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(imagesList);
        }
    }

    @PostMapping("/create")
    public ResponseEntity<Images> createImages(@RequestBody Images images) {
        Images createdImages = imagesService.createImages(images);
        return ResponseEntity.ok(createdImages);
    }


    @PutMapping("/update/{imagesId}")
    public ResponseEntity<Images> updateImages(@PathVariable(name = "imagesId") Long id, @RequestBody Images updatedImages
    ) {
        Images updateImages = imagesService.updateImages(id, updatedImages);
        if (updateImages != null) {
            return ResponseEntity.ok(updateImages);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{imagesId}")
    public ResponseEntity<Void> deleteImages(@PathVariable(name = "imagesId") Long id) {
        imagesService.deleteImages(id);
        return ResponseEntity.noContent().build();
    }
}
