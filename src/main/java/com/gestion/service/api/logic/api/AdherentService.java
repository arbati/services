package com.gestion.service.api.logic.api;

import com.gestion.service.api.to.AdherentTo;

import java.util.List;

public interface AdherentService {

    AdherentTo getById(Integer id);
    void save(AdherentTo adherentTo);
    void update(int id, AdherentTo adherentTo);
    void delete(int id);

}
