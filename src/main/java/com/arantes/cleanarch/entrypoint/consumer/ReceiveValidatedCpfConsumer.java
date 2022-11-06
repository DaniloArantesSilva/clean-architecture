package com.arantes.cleanarch.entrypoint.consumer;

import com.arantes.cleanarch.core.usecase.UpdateCustomerUseCase;
import com.arantes.cleanarch.entrypoint.consumer.mapper.CustomerMessageMapper;
import com.arantes.cleanarch.entrypoint.consumer.message.CustomerMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatedCpfConsumer {

    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "arantes")
    public void receive(CustomerMessage customerMessage) {
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerUseCase.update(customer, customerMessage.getZipCode());
    }

}
