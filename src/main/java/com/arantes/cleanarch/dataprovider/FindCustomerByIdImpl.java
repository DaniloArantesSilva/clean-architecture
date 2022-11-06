package com.arantes.cleanarch.dataprovider;

import com.arantes.cleanarch.core.domain.Customer;
import com.arantes.cleanarch.core.dataprovider.FindCustomerById;
import com.arantes.cleanarch.dataprovider.repository.CustomerRepository;
import com.arantes.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdImpl implements FindCustomerById {

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Optional<Customer> find(final String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }

}
