package com.arantes.cleanarch.core.usecase;

import com.arantes.cleanarch.core.domain.Customer;
import com.arantes.cleanarch.core.ports.in.InsertCustomerInputPort;
import com.arantes.cleanarch.core.ports.out.FindAddressByZipCodeOutputPort;
import com.arantes.cleanarch.core.ports.out.InsertCustomerOutputPort;
import com.arantes.cleanarch.core.ports.out.SendCpfForValidationOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final InsertCustomerOutputPort insertCustomerOutputPort;

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final SendCpfForValidationOutputPort sendCpfForValidationOutputPort;

    public InsertCustomerUseCase(
            InsertCustomerOutputPort insertCustomerOutputPort,
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            SendCpfForValidationOutputPort sendCpfForValidationOutputPort
    ) {
        this.insertCustomerOutputPort = insertCustomerOutputPort;
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.sendCpfForValidationOutputPort = sendCpfForValidationOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
        sendCpfForValidationOutputPort.send(customer.getCpf());
    }

}
