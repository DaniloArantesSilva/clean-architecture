package com.arantes.cleanarch.dataprovider.adapters;

import com.arantes.cleanarch.core.ports.out.SendCpfForValidationOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendCpfForValidationAdapter implements SendCpfForValidationOutputPort {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void send(final String cpf) {
        kafkaTemplate.send("tp-cpf-validation", cpf);
    }

}
