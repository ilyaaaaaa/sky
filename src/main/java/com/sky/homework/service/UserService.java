package com.sky.homework.service;

import com.sky.homework.entity.User;
import com.sky.homework.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(final String name, final String email, final String password) {
        final User user = new User.Builder()
            .name(name)
            .password(password)
            .email(email)
            .build();

        return userRepository.save(user);
    }

    public User getUser(final Long id) {
        return userRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public void deleteUser(final long id) {
        userRepository.deleteById(id);
    }

}
