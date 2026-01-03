package yograj_spring_practise.security_demo;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import yograj_spring_practise.security_demo.model.UserEntity;
import yograj_spring_practise.security_demo.repository.UserRepository;

@Service
public class CustomerDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    public CustomerDetailsService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
            UserEntity user=userRepository.findByUsername(username)
                    .orElseThrow(
                            ()->new UsernameNotFoundException("User not found")
                    );

            return User.builder()
                    .username(user.getUsername())
                    .password(user.getPassword())
                    .roles(user.getRole())
                    .build();
    }
}
