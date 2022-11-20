package com.arantes.cleanarch.config;

import com.arantes.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.arantes.cleanarch.core.usecase.impl.UpdateCustomerUseCaseImpl;
import com.arantes.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.arantes.cleanarch.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCase(
            UpdateCustomerImpl updateCustomerImpl,
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCaseImpl,
            FindAddressByZipCodeImpl findCustomerByIdAdapter
    ) {
        return new UpdateCustomerUseCaseImpl(updateCustomerImpl, findCustomerByIdUseCaseImpl, findCustomerByIdAdapter);
    }

}
