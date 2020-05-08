package guru.springframework.msscbrewery.service;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return  CustomerDto.builder().customerId(customerId)
                .customerName("Maruthi T").build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().customerId(UUID.randomUUID()).build();
    }

    @Override
    public void UpdateCustomer(UUID customerId, CustomerDto customerDto) {
        log.debug("Updating customer...");
    }

    @Override
    public void DeleteCustomerById(UUID customerId) {
        log.debug("deleting customer...");
    }


}
