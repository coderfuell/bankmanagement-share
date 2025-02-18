package bankmanagement.Database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bankmanagement.Model.Customer;

@Repository
public interface CustomerJpaInterface extends JpaRepository<Customer, String>{
    
       
}