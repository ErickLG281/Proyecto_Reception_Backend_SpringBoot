package com.ggs.receptionbackend.service.reception_service;

import com.ggs.receptionbackend.entity.reception_information.Information;

public interface InformationService {
    Information searchInformationById(Long id);
    Information createInformation(Information information);
    Information updateInformation(Long id, Information information);
    void deleteInformation(Long id);

    Information searchInformationByReceptionId(Long receptionId);
}
