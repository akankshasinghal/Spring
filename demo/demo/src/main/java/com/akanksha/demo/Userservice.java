package com.akanksha.demo;
import java.util.*;

import org.springframework.stereotype.Component;


@Component
public class Userservice {

   private static List<User> users=new ArrayList<>();
   private static int usercount=3;

   
   {
       users.add(new User("Akanskha", 1));
       users.add(new User("Raksha", 2));

   }    

   public List<User> findall()
   {
    return users;
   }

   public User findone(int id)
   {
       for(User user:users)
       {
           if(user.getId()==id)
            return user;
       }
       return null;
   }

   public User saveone(User user)
   {
           if(user.getId()==null)
            {
            user.setId(++usercount);   
            }
           users.add(user);

       return user;
   }

   public User deleteone(int id)
   {    
       Iterator <User> it = users.iterator(); 
        while (it.hasNext())
       {    
            User use=it.next();
            if(use.getId()==id){
                it.remove();
                return use;
            }
                
       }
       return null;
   }

   


    
}
