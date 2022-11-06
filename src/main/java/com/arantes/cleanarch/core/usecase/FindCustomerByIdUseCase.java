package com.arantes.cleanarch.core.usecase;

import com.arantes.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(final String id);

}
