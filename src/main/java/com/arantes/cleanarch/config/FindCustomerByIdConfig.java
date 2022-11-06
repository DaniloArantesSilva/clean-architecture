package com.arantes.cleanarch.config;

import com.arantes.cleanarch.core.usecase.FindCustomerByIdUseCaseImpl;
import com.arantes.cleanarch.dataprovider.FindCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCaseImpl findCustomerByIdUseCase(
            FindCustomerByIdImpl findCustomerByIdImpl
    ) {
        return new FindCustomerByIdUseCaseImpl(findCustomerByIdImpl);
    }

}
