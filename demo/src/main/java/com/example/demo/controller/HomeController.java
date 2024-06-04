package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {


    @RequestMapping("/")
    public String home(){
    return "world war";
}

@RequestMapping(value ="/user",method= RequestMethod.GET)//its a get request
public User user(){
        User user =new User();
        user.setId("1");
        user.setName("Arch");
        user.setEmailId("abc@gmail.com");

        return user;
}

@GetMapping("/{id1}/{id2}")
public String pathVariable(@PathVariable  String id1,@PathVariable String id2){

        return "The path varaible is"+id1 + id2;


}

@GetMapping("/requestParam") // "localhost:8080/requestParam?name=arch&emailId=akncsk"
    public String requestPara(@RequestParam String name ,@RequestParam(name="email",required = false,defaultValue = "")String emailId){
        return "Your name is : "+name+ "and emailID is: " +emailId ;
}


}
