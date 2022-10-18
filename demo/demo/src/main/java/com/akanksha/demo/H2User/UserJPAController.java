package com.akanksha.demo.H2User;
import com.akanksha.demo.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;



import java.net.URI;
import java.util.*;

@RestController
public class UserJPAController
{



@Autowired
private UserRepository ur;

@GetMapping("/jpa/Users")
public List<User> retrieveall()
{
    return ur.findAll();
}
 
@GetMapping("/jpa/Users/{id}")
public Optional<User> retrieveuser(@PathVariable int id)  //this is incomplete
{
    Optional<User> user = ur.findById(id);
    return user;
}   

@PostMapping("/jpa/Users")
public ResponseEntity<String> createuser(@RequestBody com.akanksha.demo.User user)
{
    com.akanksha.demo.User newuser=ur.save(user);
    //us.saveone(user);
    URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newuser.getId()).toUri();
return ResponseEntity.created(location).build();
}

@DeleteMapping("/jpa/Users/{id}")
public void deleteteuser(@PathVariable int id)
{
    
    ur.deleteById(id);
    
}


}