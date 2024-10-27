package com.ggs.receptionbackend.service.reception_service.impl;

import com.ggs.receptionbackend.entity.reception_information.Information;
import com.ggs.receptionbackend.repository.reception_repository.InformationRepository;
import com.ggs.receptionbackend.service.reception_service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InformationServiceImpl implements InformationService {

@Autowired
    private InformationRepository informationRepository;

@Override
    public Information searchInformationById(Long id) {
        return informationRepository.findById(id).orElse(null);
    }

@Override
    public Information createInformation(Information information) {
    information.setDescription(information.getDescription());
    information.setMaxQuantity(information.getMaxQuantity());
    information.setMinQuantity(information.getMinQuantity());
    return informationRepository.save(information);
    }

@Override
    public Information updateInformation(Long id, Information information) {
        Information newInformation = informationRepository.findById(id).orElse(null);
        if (newInformation != null) {
            newInformation.setDescription(information.getDescription());
            newInformation.setMaxQuantity(information.getMaxQuantity());
            newInformation.setMinQuantity(information.getMinQuantity());
            return informationRepository.save(newInformation);
        }
        return null;
    }

@Override
    public void deleteInformation(Long id) {
        informationRepository.deleteById(id);
    }

    @Override
    public Information searchInformationByReceptionId(Long receptionId) {
        return informationRepository.findByCompany_CompanyId(receptionId);
    }
}
