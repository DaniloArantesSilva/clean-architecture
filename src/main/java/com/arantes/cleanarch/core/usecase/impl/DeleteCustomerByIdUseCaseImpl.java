package com.arantes.cleanarch.core.usecase.impl;

import com.arantes.cleanarch.core.dataprovider.DeleteCustomerById;
import com.arantes.cleanarch.core.usecase.DeleteCustomerByIdUseCase;
import com.arantes.cleanarch.core.usecase.FindCustomerByIdUseCase;

public class DeleteCustomerByIdUseCaseImpl implements DeleteCustomerByIdUseCase {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;

    private final DeleteCustomerById deleteCustomerById;

    public DeleteCustomerByIdUseCaseImpl(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerById deleteCustomerById
    ) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.deleteCustomerById = deleteCustomerById;
    }

    @Override
    public void delete(String id) {
        findCustomerByIdUseCase.find(id);
        deleteCustomerById.delete(id);
    }

}