package com.grpc.gRPc;

import org.springframework.boot.SpringApplication;

public class TestGRPcApplication {

	public static void main(String[] args) {
		SpringApplication.from(GRPcApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
