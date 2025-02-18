package bankmanagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Entity @Getter @Setter @AllArgsConstructor public class Account {
    @Id
    private String accountId;
    
    private String accountNumber;
    private Customer accountHolder;
    private String branchName;
    private double amount;
    private boolean isDeleted = false;
}
