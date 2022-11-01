package com.arantes.cleanarch.dataprovider.repository.mapper;

import com.arantes.cleanarch.core.domain.Customer;
import com.arantes.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);

}
