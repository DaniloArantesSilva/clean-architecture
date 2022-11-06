package com.arantes.cleanarch.dataprovider;

import com.arantes.cleanarch.core.domain.Customer;
import com.arantes.cleanarch.core.dataprovider.InsertCustomer;
import com.arantes.cleanarch.dataprovider.repository.CustomerRepository;
import com.arantes.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerImpl implements InsertCustomer {

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }

}
