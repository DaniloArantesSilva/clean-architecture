package com.arantes.cleanarch.dataprovider;

import com.arantes.cleanarch.core.dataprovider.DeleteCustomerById;
import com.arantes.cleanarch.dataprovider.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdImpl implements DeleteCustomerById {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }

}
