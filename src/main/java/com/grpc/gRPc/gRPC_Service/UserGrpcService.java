package com.grpc.gRPc.gRPC_Service;

import org.springframework.grpc.server.service.GrpcService;

import user.v1.UserServiceGrpc;


@GrpcService
public class UserGrpcService extends UserServiceGrpc.UserServiceImplBase {
    
}
