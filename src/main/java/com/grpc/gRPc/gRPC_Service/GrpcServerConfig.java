package com.grpc.gRPc.gRPC_Service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.grpc.Server;
import io.grpc.ServerBuilder;

@Configuration
public class GrpcServerConfig {
    
     @Bean
    public Server grpcServer(UserGrpcService userGrpcService) throws Exception {
        return ServerBuilder
                .forPort(9090)
                .addService(userGrpcService)
                .build()
                .start();
    }
}
