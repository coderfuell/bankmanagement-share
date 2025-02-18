package bankmanagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @Entity public class Loan {

    @Id
    private String loanId;
    private String loanType;
    private double amount;
    private double interest;

    @OneToOne
    private Customer loanHolder;

    @OneToMany
    private Employe approvedBy;
    private boolean isDeleted;
}
