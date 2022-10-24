package com.example.springmvc.backend.user.service;

import com.example.springmvc.backend.address.Address;
import com.example.springmvc.backend.user.domain.User;
import com.example.springmvc.backend.user.domain.attribute.PersonalNumber;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public interface UserService
{
    User registerUserWithCorespondenceAddress(String name, String surname, PersonalNumber personalNumber, String email, Address addressOfPermanentResidence, Address addressOfCorespondence);
    User registerUserWithoutCorespondenceAddress(String name, String surname, PersonalNumber personalNumber, String email, Address addressOfPermanentResidence);
    Optional<User> findUserById(long id);
}

