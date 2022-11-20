package com.arantes.cleanarch.config;

import com.arantes.cleanarch.core.usecase.impl.DeleteCustomerByIdUseCaseImpl;
import com.arantes.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.arantes.cleanarch.dataprovider.DeleteCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCaseImpl deleteCustomerByIdUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCaseImpl,
            DeleteCustomerByIdImpl deleteCustomerByIdImpl
    ) {
        return new DeleteCustomerByIdUseCaseImpl(findCustomerByIdUseCaseImpl, deleteCustomerByIdImpl);
    }

}
