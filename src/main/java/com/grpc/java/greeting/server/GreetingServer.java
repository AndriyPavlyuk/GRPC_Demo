package com.grpc.java.greeting.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GreetingServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Hello from server");
        Server server = ServerBuilder.forPort(5200)
                .addService(new GreetServiceImpl())
                .build();
        server.start();
        server.awaitTermination();
    }
}
