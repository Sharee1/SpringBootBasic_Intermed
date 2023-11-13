package jwtauthenication3.jwtauthenication3.service;

import jwtauthenication3.jwtauthenication3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        userRepository.findByEmail(username).orElseThrow(()->new RuntimeException("USer Not Found"));
        return null;
    }
}
