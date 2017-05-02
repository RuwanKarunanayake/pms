package com.mycompany.myapp.web.rest.vm;

import com.mycompany.myapp.service.dto.UserDTO;
import javax.validation.constraints.Size;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Set;

/**
 * View Model extending the UserDTO, which is meant to be used in the user management UI.
 */
public class ManagedUserVM extends UserDTO {

    public static final int PASSWORD_MIN_LENGTH = 4;

    public static final int PASSWORD_MAX_LENGTH = 100;

    @Size(min = PASSWORD_MIN_LENGTH, max = PASSWORD_MAX_LENGTH)
    private String password;

    public ManagedUserVM() {
        // Empty constructor needed for Jackson.
    }

    public ManagedUserVM(Long id, String login, String password, String firstName, String lastName,
                         String email, String regId, LocalDate dob, String address, boolean gender, String telephone, String mobile, boolean activated, String imageUrl, String langKey,
                         String createdBy, ZonedDateTime createdDate, String lastModifiedBy, ZonedDateTime lastModifiedDate,
                         Set<String> authorities) {

        super(id, login, firstName, lastName, email, regId, dob, address, gender, telephone, mobile, activated, imageUrl, langKey,
            createdBy, createdDate, lastModifiedBy, lastModifiedDate,  authorities);

        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "ManagedUserVM{" +
            "} " + super.toString();
    }
}
