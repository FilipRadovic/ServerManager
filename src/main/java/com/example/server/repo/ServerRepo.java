package com.example.server.repo;

import com.example.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ServerRepo extends JpaRepository<Server, Long> {

    Server findByIpAddress(String ipAddress);


}
