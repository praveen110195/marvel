package com.app.marvel.model;

import com.app.marvel.Gender;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="gender")
    private Gender gender;

//    @Enumerated(EnumType.STRING)
//    @Column(name="country_origin")
//    private CountryOrigin countryOrigin;
}
