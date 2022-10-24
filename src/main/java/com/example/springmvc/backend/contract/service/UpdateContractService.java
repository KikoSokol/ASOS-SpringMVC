package com.example.springmvc.backend.contract.service;

import com.example.springmvc.backend.contract.domain.Contract;
import com.example.springmvc.backend.user.domain.User;
import org.springframework.stereotype.Service;


@Service
public interface UpdateContractService
{
    boolean updateContract(Contract contract, User oldInsurer, User newInsurer);
}
