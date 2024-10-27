package com.ggs.receptionbackend.controller.reception;

import com.ggs.receptionbackend.entity.reception_information.Information;
import com.ggs.receptionbackend.service.reception_service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("information")
public class InformationController {

    @Autowired
    private InformationService informationService;

    @GetMapping("/{receptionId}")
    public ResponseEntity<Information> searchInformationByReceptionId(@PathVariable Long receptionId) {
        Information information = informationService.searchInformationByReceptionId(receptionId);
        if (information == null) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(information);
        }
    }

    @PostMapping("/create")
    public ResponseEntity<Information> createInformation(@RequestBody Information information) {
        Information createdInformation = informationService.createInformation(information);
        return ResponseEntity.ok(createdInformation);
    }


    @PutMapping("/update/{informationId}")
    public ResponseEntity<Information> updateInformation(@PathVariable(name = "informationId") Long id, @RequestBody Information updatedInformation) {
        Information updateInformation = informationService.updateInformation(id, updatedInformation);
        if (updateInformation != null) {
            return ResponseEntity.ok(updateInformation);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{informationId}")
    public ResponseEntity<Void> deleteInformation(@PathVariable(name = "informationId") Long id) {
        informationService.deleteInformation(id);
        return ResponseEntity.noContent().build();
    }

}
