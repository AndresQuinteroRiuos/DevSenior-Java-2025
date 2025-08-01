package java.Security;
public class User {
    private String Name;
    private String password;
    private String email;
    private boolean active;
    private UserRole Role;

    
    public User(String name, String password, String email ) {
        this.Name = name;
        this.password = password;
        this.email = email;
        this.active = true;
        this.Role = UserRole.USER;
       
    }

/*
 * jav 2
 * @ author AndresQuinteroRiuos
 */
    @Override
    public String toString() {
        return getName()
    }


    public User(String Name, String password, String email, boolean active, UserRole Role) {
        this.Name = Name;
        this.password = password;
        this.email = email;
        this.active = active;
        this.Role = Role;
    }


    public void setPassword(String password) {
        this.password = password;
    }
    public void ActivateUser(){
    this.active = true;
    
}
    public void DeactivateUser(){
    this.active = false;
    
}

    public String getName() {
        return Name;
    }


    public String getPassword() {
        return password;
    }


    public String getEmail() {
        return email;
    }


    public boolean isActive() {
        return active;
    }


    public UserRole getRole() {
        return Role;
    }


    public void setRole(UserRole role) {
        Role = role;
    }
   
}
