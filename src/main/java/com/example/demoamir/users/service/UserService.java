package com.example.demoamir.users.service;



import com.example.demoamir.users.models.User;
import com.example.demoamir.users.repositories.UserRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;


    // Find by id
    public User findById (long id){
        Optional<User> findByUserId = userRepository.findById(id);
        return  findByUserId.orElse(null);
    }


    // Find all
    public List<User> findAll(){
        return  userRepository.findAll();
    }


    // Delete by id
    public long deleteById(long id){

        if(! userRepository.existsById(id)){
            return  0;
        } else {

            userRepository.deleteById(id);
        }

        return id;
    }

}
