package com.grpc.gRPc.Service;

import java.util.UUID;

import com.grpc.gRPc.Entity.Users;

public interface UserService {
    Users createUser();

    Users  getUSer(UUID id);

}
