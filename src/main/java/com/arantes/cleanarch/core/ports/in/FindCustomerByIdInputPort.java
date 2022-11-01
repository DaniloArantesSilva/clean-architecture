package com.arantes.cleanarch.core.ports.in;

import com.arantes.cleanarch.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(final String id);

}
