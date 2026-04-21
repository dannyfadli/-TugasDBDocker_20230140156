package com.example.pratikum6.service;

import com.example.pratikum6.model.User;
import com.example.pratikum6.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User addUser (User request){
        request.setId(UUID.randomUUID().toString());
        return userRepository.save(request);
    }

    public List<User> getAllusers() {
        return userRepository.findAll();
    }

    public User getUserBYId(String id){
        return userRepository.findById(id).orElse(null);
    }

    public User updareUser(String id, User request){
        User exisringUser = userRepository.findById(id).orElse(null);
        if (exisringUser != null){
            exisringUser.setName(request.getName());
            exisringUser.setNim(request.getNim());
            return userRepository.save(exisringUser);
        }
        return null;
    }

    public void  deleteUser(String id)
    {
        userRepository.deleteById(id);
    }
}
