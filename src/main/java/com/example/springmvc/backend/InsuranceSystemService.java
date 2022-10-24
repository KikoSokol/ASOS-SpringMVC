package com.example.springmvc.backend;


import com.example.springmvc.backend.contract.service.ContractService;
import com.example.springmvc.backend.contract.service.InformationContractService;
import com.example.springmvc.backend.contract.service.UpdateContractService;
import com.example.springmvc.backend.user.service.InformationUserService;
import com.example.springmvc.backend.user.service.UpdateUserService;
import com.example.springmvc.backend.user.service.UserService;

public interface InsuranceSystemService
{
    UserService getUserService();
    void setUserService(UserService userService);
    InformationUserService getInformationUserService();
    void setInformationUserService(InformationUserService informationUserService);
    UpdateUserService getUpdateUser();
    void setUpdateUser(UpdateUserService updateUser);
    ContractService getContractService();
    void setContractService(ContractService contractService);
    UpdateContractService getUpdateContractService();
    void setUpdateContractService(UpdateContractService updateContractService);
    InformationContractService getInformationContractService();
    void setInformationContractService(InformationContractService informationContractService);
}
