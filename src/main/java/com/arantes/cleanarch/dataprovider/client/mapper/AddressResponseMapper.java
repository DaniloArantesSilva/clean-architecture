package com.arantes.cleanarch.dataprovider.client.mapper;

import com.arantes.cleanarch.core.domain.Address;
import com.arantes.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
