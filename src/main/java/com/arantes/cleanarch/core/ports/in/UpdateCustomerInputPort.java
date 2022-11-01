package com.arantes.cleanarch.core.ports.in;

import com.arantes.cleanarch.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);

}
