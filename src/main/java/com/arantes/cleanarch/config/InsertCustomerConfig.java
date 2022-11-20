package com.arantes.cleanarch.config;

import com.arantes.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.arantes.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.arantes.cleanarch.dataprovider.InsertCustomerImpl;
import com.arantes.cleanarch.dataprovider.SendCpfForValidationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(
            InsertCustomerImpl insertCustomerImpl,
            FindAddressByZipCodeImpl findCustomerByIdAdapter,
            SendCpfForValidationImpl sendCpfForValidationImpl
    ) {
        return new InsertCustomerUseCaseImpl(insertCustomerImpl, findCustomerByIdAdapter, sendCpfForValidationImpl);
    }

}
