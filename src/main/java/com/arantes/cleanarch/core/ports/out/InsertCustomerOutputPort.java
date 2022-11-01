package com.arantes.cleanarch.core.ports.out;

import com.arantes.cleanarch.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);

}
