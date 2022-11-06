package com.arantes.cleanarch.core.usecase;

import com.arantes.cleanarch.core.domain.Customer;
import com.arantes.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.arantes.cleanarch.core.dataprovider.UpdateCustomer;

public class UpdateCustomerUseCaseImpl implements UpdateCustomerUseCase {

    private final UpdateCustomer updateCustomer;

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;

    private final FindAddressByZipCode findAddressByZipCode;

    public UpdateCustomerUseCaseImpl(
            UpdateCustomer updateCustomer,
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCode findAddressByZipCode
    ) {
        this.updateCustomer = updateCustomer;
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.findAddressByZipCode = findAddressByZipCode;
    }

    @Override
    public void update(Customer customer, String zipCode) {
        findCustomerByIdUseCase.find(customer.getId());
        var address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        updateCustomer.update(customer);
    }

}
