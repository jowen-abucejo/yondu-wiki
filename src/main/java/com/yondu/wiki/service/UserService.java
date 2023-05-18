package com.yondu.wiki.service;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.yondu.wiki.entity.User;
import com.yondu.wiki.repository.UserRepository;

@Service
public class UserService implements UserDetailsService {
    private final UserRepository userRepository;

    /**
     * @param userRepository
     */
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByEmailOrUsernameAndIsActive(username).orElseThrow(
                () -> new UsernameNotFoundException(
                        String.format("Active user with email or username of '%s' not found", username)));
    }

}
