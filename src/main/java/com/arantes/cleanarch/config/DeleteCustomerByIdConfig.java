package com.arantes.cleanarch.config;

import com.arantes.cleanarch.core.usecase.DeleteCustomerByIdUseCase;
import com.arantes.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.arantes.cleanarch.dataprovider.adapters.DeleteCustomerByIdAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ) {
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }

}
