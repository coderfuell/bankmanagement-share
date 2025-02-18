package bankmanagement.Database;

import java.util.ArrayList;
import java.util.List;

import bankmanagement.Model.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDb {
    private List<User> users;

    public UserDb() {
        users = new ArrayList<>();
    }

    public void addUser(User u){
        users.add(u);
    }

    public User searchUser(String email){
        for (var u: users){
            if (u.isDeleted()) continue;
            if (u.getEmail().equals(email)){
                return u;
            }
        }
        return null;
    }

    public int deleteUser(String email){
        for (var u: users){
            if (u.getEmail().equals(email)){
                u.setDeleted(true);
                return 0;
            }
        }
        return 1;
    }
}
