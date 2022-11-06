package com.arantes.cleanarch.core.dataprovider;

import com.arantes.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(final String zipCode);

}
