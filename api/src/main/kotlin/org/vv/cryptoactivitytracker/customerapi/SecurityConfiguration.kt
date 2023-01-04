package org.vv.cryptoactivitytracker.customerapi

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.web.SecurityFilterChain

@EnableWebSecurity
@Configuration
class SecurityConfiguration  {
    @Bean
    fun filterChain(security: HttpSecurity): SecurityFilterChain {
        security.authorizeHttpRequests {
            it.anyRequest().anonymous()
        }
        return security.build();
    }
}