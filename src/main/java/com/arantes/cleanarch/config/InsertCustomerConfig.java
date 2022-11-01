package com.arantes.cleanarch.config;

import com.arantes.cleanarch.core.usecase.InsertCustomerUseCase;
import com.arantes.cleanarch.dataprovider.adapters.FindAddressByZipCodeAdapter;
import com.arantes.cleanarch.dataprovider.adapters.InsertCustomerAdapter;
import com.arantes.cleanarch.dataprovider.adapters.SendCpfForValidationAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            InsertCustomerAdapter insertCustomerAdapter,
            FindAddressByZipCodeAdapter findCustomerByIdAdapter,
            SendCpfForValidationAdapter sendCpfForValidationAdapter
    ) {
        return new InsertCustomerUseCase(insertCustomerAdapter, findCustomerByIdAdapter, sendCpfForValidationAdapter);
    }

}
