package com.arantes.cleanarch.core.usecase;

import com.arantes.cleanarch.core.domain.Customer;
import com.arantes.cleanarch.core.ports.in.FindCustomerByIdInputPort;
import com.arantes.cleanarch.core.ports.in.UpdateCustomerInputPort;
import com.arantes.cleanarch.core.ports.out.FindAddressByZipCodeOutputPort;
import com.arantes.cleanarch.core.ports.out.UpdateCustomerOutputPort;

public class UpdateCustomerUseCase implements UpdateCustomerInputPort {

    private final UpdateCustomerOutputPort updateCustomerOutputPort;

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    public UpdateCustomerUseCase(
            UpdateCustomerOutputPort updateCustomerOutputPort,
            FindCustomerByIdInputPort findCustomerByIdInputPort,
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort
    ) {
        this.updateCustomerOutputPort = updateCustomerOutputPort;
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
    }

    @Override
    public void update(Customer customer, String zipCode) {
        findCustomerByIdInputPort.find(customer.getId());
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        updateCustomerOutputPort.update(customer);
    }

}
