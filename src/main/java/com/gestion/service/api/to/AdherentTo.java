package com.gestion.service.api.to;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdherentTo {

    private Integer id;
    private String firstName;
    private String lastName;
    private String address;
    private String birthDay;
    private Integer userId;
    private String createdDate;

}
