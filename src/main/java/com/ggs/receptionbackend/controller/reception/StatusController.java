package com.ggs.receptionbackend.controller.reception;

import com.ggs.receptionbackend.entity.reception_information.Status;
import com.ggs.receptionbackend.service.reception_service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("status")
public class StatusController {

    @Autowired
    private StatusService statusService;

    @GetMapping("/{receptionId}")
    public ResponseEntity<Status> searchStatusByReceptionId(@PathVariable Long receptionId) {
        Status status = statusService.searchStatusByReceptionId(receptionId);
        if (status == null) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(status);
        }
    }

    @GetMapping("/client/{clientId}")
    public ResponseEntity<Status> searchStatusByClientId(@PathVariable Long clientId) {
        Status status = statusService.searchStatusByClientId(clientId);
        if (status == null) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(status);
        }
    }

    @PostMapping
    public ResponseEntity<Status> createStatus(@RequestBody Status status) {
        Status createdStatus = statusService.createStatus(status);
        return ResponseEntity.ok(createdStatus);
    }

    @PutMapping("/update/{statusId}")
    public ResponseEntity<Status> updateStatus(@PathVariable(name = "statusId") Long id, @RequestBody Status updatedStatus) {
        Status updateStatus = statusService.updateStatus(id, updatedStatus);
        if (updateStatus != null) {
            return ResponseEntity.ok(updateStatus);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{statusId}")
    public ResponseEntity<Void> deleteStatus(@PathVariable(name = "statusId") Long id) {
        statusService.deleteStatus(id);
        return ResponseEntity.noContent().build();
    }


}
