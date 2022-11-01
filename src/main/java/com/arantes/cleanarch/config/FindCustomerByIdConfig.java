package com.arantes.cleanarch.config;

import com.arantes.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.arantes.cleanarch.dataprovider.adapters.FindCustomerByIdAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(
            FindCustomerByIdAdapter findCustomerByIdAdapter
    ) {
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }

}
