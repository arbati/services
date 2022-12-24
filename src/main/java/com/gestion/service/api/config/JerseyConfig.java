package com.gestion.service.api.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gestion.service.api.provider.ObjectMapperContextResolver;
import com.gestion.service.api.service.rest.exception.ServiceExceptionHandler;
import com.gestion.service.api.service.rest.impl.ApiAdherentServiceImpl;
import com.gestion.service.api.service.rest.impl.GestionServiceRestServiceImpl;
import org.glassfish.jersey.jackson.internal.DefaultJacksonJaxbJsonProvider;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

@Configuration
@ApplicationPath("/services/rest/v1.0")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig(ObjectMapper objectMapper) {
        register(ServiceExceptionHandler.class);
        register(new ObjectMapperContextResolver(objectMapper));
        register(DefaultJacksonJaxbJsonProvider.class, MessageBodyReader.class, MessageBodyWriter.class);
        //register(GestionServiceRestServiceImpl.class);
        register(ApiAdherentServiceImpl.class);
    }



}
