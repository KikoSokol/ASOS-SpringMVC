package com.example.springmvc.backend.contract.web.resource;

import com.example.springmvc.backend.address.Address;
import com.example.springmvc.backend.address.attribute.PostalCode;
import com.example.springmvc.backend.address.attribute.PostalCodeParseException;
import com.example.springmvc.backend.contract.domain.PropertyType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public abstract class NonLifeInsuranceResource extends ContractResource
{
    @NotNull
    protected PropertyType propertyType;
    @NotBlank
    protected String street;
    @Positive
    protected int numberOfHouse;
    @NotBlank
    protected String city;
    @NotBlank
    @Size(min = 5,max = 6)
    protected String postalCode;
    @Positive
    protected double valueOfProperty;


    public Address getAddress() throws PostalCodeParseException {
        return new Address(this.city,this.street,new PostalCode(this.postalCode),this.numberOfHouse);
    }

}
