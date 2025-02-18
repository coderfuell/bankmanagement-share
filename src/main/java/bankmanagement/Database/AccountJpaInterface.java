package bankmanagement.Database;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import bankmanagement.Model.Account;


public interface AccountJpaInterface extends JpaRepository<Account, String>{
    // @Override
    // public List<Account> findAll();
    // @Override
    // public Optional<Account> findById(String id);
    // @Override
    // public <S extends Account> List<S> saveAll(Iterable<S> entities);
    
    
}

