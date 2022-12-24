package com.gestion.service.api.logic.impl;

import com.gestion.service.api.dataaccess.dao.RepositoryAdherent;
import com.gestion.service.api.dataaccess.entities.Adherent;
import com.gestion.service.api.logic.api.AdherentService;
import com.gestion.service.api.to.AdherentTo;
import org.dozer.DozerBeanMapper;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Optional;

@Named
public class AdherentServiceImpl implements AdherentService {

    @Inject
    DozerBeanMapper dozer;

    @Inject
    RepositoryAdherent repo;

    @Override
    public AdherentTo getById(Integer id) {

        AdherentTo adherentTo=new AdherentTo();
        Adherent adherent = repo.findById(id).get();
        System.out.println(adherent.toString());

        dozer.map(adherent,adherentTo);
        return adherentTo;
    }

    @Override
    public void save(AdherentTo adherentTo) {

        Adherent adherent = new Adherent();
        dozer.map(adherentTo,adherent);
        repo.save(adherent);

    }

    @Override
    public void update(int id, AdherentTo adherentTo) {
        Adherent adherent=new Adherent();
        dozer.map(adherentTo,adherent);
        adherent.setId(id);
        repo.save(adherent);
    }

    @Override
    public void delete(int id) {
     Optional<Adherent> adherent=repo.findById(id);
     repo.delete(adherent.get());
    }


}
