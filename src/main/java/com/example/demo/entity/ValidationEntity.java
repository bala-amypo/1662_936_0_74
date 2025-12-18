package com.example.demo.Entity
import jakarta.presistence.Entity;

@Entity
public class ValidationEntity{
    @Id
    @GenerateValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String username;
     private String email ;
      private String password;
       private int age;
       @Size(min=2,max=10,messsage="must be 2 to 10 character")
       prinvate String username;
       @Email(message)
}