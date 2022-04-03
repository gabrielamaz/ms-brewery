package guru.springframework.msbrewery.services;

import guru.springframework.msbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService{

    public CustomerDto getCustomerById() {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Name")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        log.debug("Updating Customer");
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting a customer");
    }
}
