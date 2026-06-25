package com.grpc.gRPc.gRPC_Service;

import org.springframework.grpc.server.service.GrpcService;

import io.grpc.stub.StreamObserver;
import user.v1.CreateUserRequest;
import user.v1.GetUserRequest;
import user.v1.User;
import user.v1.UserResponse;
import user.v1.UserServiceGrpc;


@GrpcService
public class UserGrpcService extends UserServiceGrpc.UserServiceImplBase {

    @Override
    public void createUser(CreateUserRequest request,
                           StreamObserver<UserResponse> responseObserver) {

        // simulate DB save (replace with service/repo later)
        User user = User.newBuilder()
                .setId(java.util.UUID.randomUUID().toString())
                .setFirstName(request.getFirstName())
                .setLastName(request.getLastName())
                .setEmail(request.getEmail())
                .setCreatedAt(java.time.Instant.now().toString())
                .build();

        UserResponse response = UserResponse.newBuilder()
                .setUser(user)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

     @Override
    public void getUser(GetUserRequest request,
                        StreamObserver<UserResponse> responseObserver) {

        // dummy response (replace with DB fetch later)
        User user = User.newBuilder()
                .setId(request.getId())
                .setFirstName("John")
                .setLastName("Doe")
                .setEmail("john@example.com")
                .setCreatedAt(java.time.Instant.now().toString())
                .build();

        UserResponse response = UserResponse.newBuilder()
                .setUser(user)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    
    
}
