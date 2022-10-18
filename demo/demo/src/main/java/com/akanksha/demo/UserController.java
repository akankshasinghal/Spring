package com.akanksha.demo;

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
public class UserController
{

@Autowired    
private Userservice us;

@GetMapping("/Users")
public List<User> retrieveall()
{
    return us.findall();
}

@GetMapping("/Users/{id}")
public User retrieveuser(@PathVariable int id)
{
    return us.findone(id);
}

@PostMapping("/Users")
public ResponseEntity<String> createuser(@RequestBody User user)
{
    User newuser=us.saveone(user);
    //us.saveone(user);
    URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newuser.getId()).toUri();
return ResponseEntity.created(location).build();
}

@DeleteMapping("/Users/{id}")
public void deleteteuser(@PathVariable int id)
{
    
    us.deleteone(id);
    
}


}