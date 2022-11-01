package com.arantes.cleanarch.core.ports.in;

import com.arantes.cleanarch.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);

}
