package securewallet.securewallet.model;

import jakarta.persistence.*;


@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;


    private String username;
    private String password;
    private String email;
    // Getters and setters
    public Long  getId()
    {
        return id;
    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    public String getEmail()
    {
        return email;
    }
}
