package bankmanagement.Database;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bankmanagement.Model.Account;

@Repository
public interface AccountJpaInterface extends JpaRepository<Account, String>{
    Optional<Account> findByNumber(String number);
       
}

