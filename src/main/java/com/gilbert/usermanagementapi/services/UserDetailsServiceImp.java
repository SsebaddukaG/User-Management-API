package com.gilbert.usermanagementapi.services;

import com.gilbert.usermanagementapi.dao.UserRepository;
import com.gilbert.usermanagementapi.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsServiceImp implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findUserByUserName(s);
        user.orElseThrow(()-> new UsernameNotFoundException("User not found" + s));
        return new UserDetailsImpl(user.get());
    }
}
