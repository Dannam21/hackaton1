package org.dbp.hackaton1.user.infrastructure;

import org.dbp.hackaton1.user.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createStudent(User user){
        return userRepository.save(user);
    }
}


