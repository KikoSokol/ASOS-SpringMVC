package com.example.springmvc.backend.user.service;

import com.example.springmvc.backend.user.domain.User;
import org.springframework.stereotype.Service;


import java.util.Map;
import java.util.Set;

@Service
public interface InformationUserService
{
    Map<Long, User> getAllUsers();
    Set<Long> getAllContractsOfUserById(long idUser);
}
