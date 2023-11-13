package jwtauthenication3.jwtauthenication3.service;

import jwtauthenication3.jwtauthenication3.model.User;
import jwtauthenication3.jwtauthenication3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

   @Autowired

   private UserRepository userRepository;



   public List<User> getUser(){

      return userRepository.findAll();
   }


   public  User createUser(User user){

      user.setUserId(UUID.randomUUID().toString());
      return userRepository.save(user);
   }


}
