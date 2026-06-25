package com.grpc.gRPc.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grpc.gRPc.Entity.Users;

public interface UserRepository extends JpaRepository<Users, UUID> {
    
}
