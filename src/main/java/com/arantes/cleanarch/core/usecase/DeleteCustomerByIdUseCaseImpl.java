package com.arantes.cleanarch.core.usecase;

import com.arantes.cleanarch.core.dataprovider.DeleteCustomerById;

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
    public void delete(final String id) {
        findCustomerByIdUseCase.find(id);
        deleteCustomerById.delete(id);
    }

}