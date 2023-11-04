package com.example.springboot_login.Email;

public interface EmailSender {
    default void send(String to, String email){
    }
}
