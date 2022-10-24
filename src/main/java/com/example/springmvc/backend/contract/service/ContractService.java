package com.example.springmvc.backend.contract.service;

import com.example.springmvc.backend.address.Address;
import com.example.springmvc.backend.contract.domain.Contract;
import com.example.springmvc.backend.contract.domain.PropertyType;
import com.example.springmvc.backend.contract.domain.PurposeOfTrip;
import com.example.springmvc.backend.contract.domain.TerritorialValidity;
import com.example.springmvc.backend.user.domain.User;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public interface ContractService
{
    Contract registerTravelInsurance(User insurer, LocalDateTime start, LocalDateTime end, double amountOfInsuranceIndemnity, double monthlyPayment, User insured, boolean inEurope, PurposeOfTrip purposeOfTrip);
    Contract registerAccidentInsurance(User insurer, LocalDateTime startOfInsurance, LocalDateTime endOfInsurance, double amountOfInsuranceIndemnity, double monthlyPayment, User insured, double sumInsuredOfLastingConsequences, double sumInsuredOfDeath, double sumInsuredOfDailyCompensation, TerritorialValidity territorialValidity);
    Contract registerHouseFlatInsurance(User insurer, LocalDateTime startOfInsurance, LocalDateTime endOfInsurance, double amountOfInsuranceIndemnity, double monthlyPayment, PropertyType propertyType, Address address, double valueOfProperty, boolean isGarageInsurance);
    Contract registerHouseHoldInsurance(User insurer, LocalDateTime startOfInsurance, LocalDateTime endOfInsurance, double amountOfInsuranceIndemnity, double monthlyPayment, PropertyType propertyType, Address address, double valueOfProperty, double valueOfHouseholdAppliances);

    Optional<Contract> findContractById(long idContract);
}
