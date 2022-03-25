package guru.springframework.msbrewery.services;

import guru.springframework.msbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService{

    public CustomerDto getCustomerById() {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Name")
                .build();
    }
}
