package pl.jana.bilety.user;

import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class User {
    private int id;

    @NotEmpty(message = "Username is required")
    private String username;

    @NotEmpty(message = "Password is required")
    private String password;

    // konstruktory, gettery i settery
}