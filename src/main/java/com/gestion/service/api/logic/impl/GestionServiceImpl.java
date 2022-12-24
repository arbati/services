package com.gestion.service.api.logic.impl;

import com.gestion.service.api.logic.api.GestionService;
import com.gestion.service.api.to.MessageTo;
import org.dozer.DozerBeanMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class GestionServiceImpl implements GestionService {

    private static final Logger logger = LoggerFactory.getLogger(GestionServiceImpl.class);

    @Inject
    DozerBeanMapper dozer;

    @Override
    public MessageTo getMessage() {
        MessageTo message = new MessageTo();
        message.setMessage("Test KO CALL INTERFACE instance CLASS");
        message.setCode(400);
        return message;
    }

    @Override
    public MessageTo getMessage(Integer code) {

        String message = "";

        if(code == 200) {
            message="succeed";
        } else if (code == 404) {
            message="Failed";
        }else {
            message="Invalid code";
        }

       return  new MessageTo(code,message);

    }


}
