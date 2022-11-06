package com.arantes.cleanarch.core.usecase;

import com.arantes.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {

    void update(Customer customer, String zipCode);

}
