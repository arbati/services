package com.gestion.service.api.service.rest.impl;

import com.gestion.service.api.api.ApiAdherentService;
import com.gestion.service.api.logic.api.AdherentService;
import com.gestion.service.api.to.AdherentTo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Inject;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ApiAdherentServiceImpl implements ApiAdherentService {

    @Inject
    AdherentService service;

    @Override
    public AdherentTo getAdherent(Integer id) {

      return  service.getById(id);

    }

    @Override
    public void saveAdherent(AdherentTo adherentTo) {
        //service.save(new AdherentTo(id,"Abdo","Rbati","Casa", LocalDate.now().toString(),1, LocalDateTime.now().toString()));

        service.save(adherentTo);
    }

    @Override
    public void updateAdherent(Integer id, AdherentTo adherentTo) {
        service.update(id,adherentTo);
    }

    @Override
    public void deleteAdherent(Integer id) {
    service.delete(id);
    }

}
