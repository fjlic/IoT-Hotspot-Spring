package com.example.IoTHotspot.Interfaces;

import org.springframework.data.repository.CrudRepository;
import com.example.IoTHotspot.Models.User;

public interface UserInterface  extends CrudRepository<User, Long> {
    
}
