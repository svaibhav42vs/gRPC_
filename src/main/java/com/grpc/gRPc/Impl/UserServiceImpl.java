package com.grpc.gRPc.Impl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.grpc.gRPc.Entity.Users;
import com.grpc.gRPc.Service.UserService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements  UserService {

    @Override
    public Users createUser() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createUser'");
    }

    @Override
    public Users getUSer(UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUSer'");
    }
    
}
