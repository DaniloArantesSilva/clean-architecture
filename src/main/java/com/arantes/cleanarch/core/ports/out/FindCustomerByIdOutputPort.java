package com.arantes.cleanarch.core.ports.out;

import com.arantes.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(final String id);

}
