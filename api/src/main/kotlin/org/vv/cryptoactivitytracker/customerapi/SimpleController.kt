package org.vv.cryptoactivitytracker.customerapi

import Token
import Token.GetTokenInfoRequest
import TokenInfoServiceGrpcKt.TokenInfoServiceCoroutineStub
import kotlinx.coroutines.runBlocking
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class SimpleController {

    @Autowired
    private lateinit var rpcStub: TokenInfoServiceCoroutineStub

    @GetMapping("/")
    fun sayHello(): String {
        return "Hello there"
    }

    @GetMapping("/token-info")
    fun getToken(): String {
        val request = GetTokenInfoRequest
            .newBuilder()
            .setBlockchain(Token.Blockchain.ETHEREUM)
            .setTokenSymbol("AAVE")
            .build()

        val response = runBlocking {
             rpcStub.getTokenInfo(request)
        }
        return """
            {
                "name": "${response.tokenInfo.name}",
                "decimal_size": "${response.tokenInfo.decimalSize}"
            }
        """.trimIndent()
    }
}