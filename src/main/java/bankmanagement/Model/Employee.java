package bankmanagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"email"})})
public class Employee{
    private String name;
    @Id
    private String userId;
    private String email;
    private String password;
    private boolean isDeleted;
}
