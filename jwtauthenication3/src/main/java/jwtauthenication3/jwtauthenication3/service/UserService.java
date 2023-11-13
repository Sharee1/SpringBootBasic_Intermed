package jwtauthenication3.jwtauthenication3.service;

import jwtauthenication3.jwtauthenication3.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {


   private List<User> store= new ArrayList<>();


   public  UserService(){

//      store.add(new User(UUID.randomUUID().toString(),"Shaheer","shaheermajid2002@gmail.com"));
//              store.add(new User(UUID.randomUUID().toString(),"Waqas","Waqqs@gmail.com"));
//      store.add(new User(UUID.randomUUID().toString(),"Rafeeq","Rafeeq@gmail.com"));
//      store.add(new User(UUID.randomUUID().toString(),"Shakeel","Shakeel@gmail.com"));
//

   }



   public List<User> getUser(){


      return this.store;
   }
}
