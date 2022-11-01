package com.arantes.cleanarch.core.ports.out;

import com.arantes.cleanarch.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(final String zipCode);

}
