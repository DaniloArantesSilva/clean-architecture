package com.arantes.cleanarch.dataprovider.adapters;

import com.arantes.cleanarch.core.domain.Address;
import com.arantes.cleanarch.core.ports.out.FindAddressByZipCodeOutputPort;
import com.arantes.cleanarch.dataprovider.client.FindAddressByZipCodeClient;
import com.arantes.cleanarch.dataprovider.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient client;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipcode) {
        var addressResponse = client.find(zipcode);
        return addressResponseMapper.toAddress(addressResponse);
    }

}
