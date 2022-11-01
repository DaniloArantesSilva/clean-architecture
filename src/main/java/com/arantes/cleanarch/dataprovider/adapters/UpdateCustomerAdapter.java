package com.arantes.cleanarch.dataprovider.adapters;

import com.arantes.cleanarch.core.domain.Customer;
import com.arantes.cleanarch.core.ports.out.UpdateCustomerOutputPort;
import com.arantes.cleanarch.dataprovider.repository.CustomerRepository;
import com.arantes.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }

}
