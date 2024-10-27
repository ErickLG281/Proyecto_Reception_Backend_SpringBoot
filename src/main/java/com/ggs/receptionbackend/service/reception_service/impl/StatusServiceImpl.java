package com.ggs.receptionbackend.service.reception_service.impl;

import com.ggs.receptionbackend.entity.reception_information.Status;
import com.ggs.receptionbackend.repository.reception_repository.StatusRepository;
import com.ggs.receptionbackend.service.reception_service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusServiceImpl implements StatusService {
    @Autowired
    private StatusRepository statusRepository;

    @Override
    public Status searchStatusById(Long id) {
        return statusRepository.findById(id).orElse(null);
    }

    @Override
    public Status createStatus(Status status) {
        status.setStatus(status.getStatus());
        return statusRepository.save(status);
    }

    @Override
    public Status updateStatus(Long id, Status status) {
        Status newStatus = statusRepository.findById(id).orElse(null);
        if (newStatus != null) {
            newStatus.setStatus(status.getStatus());
            return statusRepository.save(newStatus);
        }
        return null;
    }

    @Override
    public void deleteStatus(Long id) {
        statusRepository.deleteById(id);
    }

    @Override
    public Status searchStatusByReceptionId(Long receptionId) {
        return statusRepository.findByCompany_CompanyId(receptionId);
    }

    @Override
    public Status searchStatusByClientId(Long clientId) {
        return statusRepository.findByClient_ClientId(clientId);
    }

}
