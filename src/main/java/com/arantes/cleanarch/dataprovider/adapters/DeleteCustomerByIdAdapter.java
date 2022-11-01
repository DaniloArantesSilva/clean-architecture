package com.arantes.cleanarch.dataprovider.adapters;

import com.arantes.cleanarch.core.ports.out.DeleteCustomerByIdOutputPort;
import com.arantes.cleanarch.dataprovider.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void delete(final String id) {
        customerRepository.deleteById(id);
    }

}
