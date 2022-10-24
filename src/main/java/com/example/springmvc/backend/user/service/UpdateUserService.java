package com.example.springmvc.backend.user.service;

import com.example.springmvc.backend.user.domain.User;
import org.springframework.stereotype.Service;


@Service
public interface UpdateUserService
{
    boolean updateUser(User user);
}
