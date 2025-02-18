package bankmanagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Entity @Getter @Setter @AllArgsConstructor
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"Number"})})
public class Account {
    @Id
    private String Id;
    
    private String number;

    @OneToOne
    private Customer accountHolder;
    private String branchName;
    private double amount;
    private boolean isDeleted = false;
}
