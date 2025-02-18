package bankmanagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public record Transaction (@Id String transactionId,String transactionAmount,Account transactionFrom,Account transactionTo){
    
}
