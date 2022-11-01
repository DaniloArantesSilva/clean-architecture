package com.arantes.cleanarch.core.ports.out;

import com.arantes.cleanarch.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);

}
