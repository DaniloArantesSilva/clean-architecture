package com.arantes.cleanarch.config;

import com.arantes.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.arantes.cleanarch.core.usecase.UpdateCustomerUseCase;
import com.arantes.cleanarch.dataprovider.adapters.FindAddressByZipCodeAdapter;
import com.arantes.cleanarch.dataprovider.adapters.UpdateCustomerAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            UpdateCustomerAdapter updateCustomerAdapter,
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findCustomerByIdAdapter
    ) {
        return new UpdateCustomerUseCase(updateCustomerAdapter, findCustomerByIdUseCase, findCustomerByIdAdapter);
    }

}
