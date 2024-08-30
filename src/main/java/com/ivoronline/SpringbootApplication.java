package com.ivoronline;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

 
  public static void main(String[] args) throws JsonProcessingException {
    SpringApplication.run(SpringbootApplication.class, args);
    
    //CREATE OBJECT
    Person person      = new Person();
           person.name = "John";
           person.age  = 20;

    //PRINT OBJECT
    ObjectMapper objectMapper = new ObjectMapper();
    String       personJson   = objectMapper.writeValueAsString(person);
    System.out.println(personJson);
    
  }
  
}
