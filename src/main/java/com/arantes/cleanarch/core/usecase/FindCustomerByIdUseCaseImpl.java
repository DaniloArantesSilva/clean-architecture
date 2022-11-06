package com.arantes.cleanarch.core.usecase;

import com.arantes.cleanarch.core.domain.Customer;
import com.arantes.cleanarch.core.dataprovider.FindCustomerById;

public class FindCustomerByIdUseCaseImpl implements FindCustomerByIdUseCase {

    private final FindCustomerById findCustomerById;

    public FindCustomerByIdUseCaseImpl(FindCustomerById findCustomerById) {
        this.findCustomerById = findCustomerById;
    }

    @Override
    public Customer find(final String id) {
        return findCustomerById.find(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }

}