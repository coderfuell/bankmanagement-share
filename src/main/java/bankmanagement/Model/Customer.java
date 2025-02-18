package bankmanagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter @AllArgsConstructor
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"email"})})
public abstract class Customer{
    private String name;
    @Id
    private String userId;
    private String email;
    private String password;
    private boolean isDeleted;
}
