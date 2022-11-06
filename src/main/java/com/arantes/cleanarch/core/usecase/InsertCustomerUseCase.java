package com.arantes.cleanarch.core.usecase;

import com.arantes.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer customer, String zipCode);

}
