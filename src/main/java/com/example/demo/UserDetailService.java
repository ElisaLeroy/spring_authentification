
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
@Bean
public UserDetailsService userDetailsService() {
    InMemoryUserDetailsManager userDetailsManager = new InMemoryUserDetailsManager()
            ;
    userDetailsManager.createUser(
            User.withDefaultPasswordEncoder()
                    .username("admin")
                    .password("admin123")
                    .roles("ADMIN")
                    .build()
    );
    userDetailsManager.createUser(
            User.withDefaultPasswordEncoder()
                    .username("user")
                    .password("user123")
                    .roles("USER")
                    .build()
    );
    return userDetailsManager;
}

public void main() {
}

