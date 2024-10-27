package com.ggs.receptionbackend.service.reception_service;

import com.ggs.receptionbackend.entity.reception_information.Status;

public interface StatusService {
    Status searchStatusById(Long id);
    Status createStatus(Status status);
    Status updateStatus(Long id, Status status);
    void deleteStatus(Long id);

    Status searchStatusByReceptionId(Long receptionId);

    Status searchStatusByClientId(Long clientId);
}
