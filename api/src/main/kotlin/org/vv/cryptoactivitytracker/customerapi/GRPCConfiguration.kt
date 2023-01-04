package org.vv.cryptoactivitytracker.customerapi

import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import TokenInfoServiceGrpcKt.TokenInfoServiceCoroutineStub

@Configuration
class GRPCConfiguration {

    @Bean
    fun GRPCChannel(): ManagedChannel = ManagedChannelBuilder
        .forAddress("localhost",50051)
        .usePlaintext()
        .build()

    @Bean
    fun GRPCStub(): TokenInfoServiceCoroutineStub =
        TokenInfoServiceCoroutineStub((this.GRPCChannel()))

}