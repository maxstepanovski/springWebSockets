package com.mstepanov.internetapi

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.socket.config.annotation.EnableWebSocket
import org.springframework.web.socket.config.annotation.WebSocketConfigurer
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry
import org.springframework.web.socket.handler.TextWebSocketHandler
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor

@Configuration
@EnableWebSocket
class WebSocketConfig : WebSocketConfigurer {

    override fun registerWebSocketHandlers(registry: WebSocketHandlerRegistry) {
        registry
                .addHandler(SocketHandler(), "/handler")
                .addInterceptors(createHttpSessionInterceptor())
                .setAllowedOrigins("*")
    }

    @Bean
    fun createSocketHandler(): TextWebSocketHandler {
        return SocketHandler()
    }

    @Bean
    fun createHttpSessionInterceptor(): HttpSessionHandshakeInterceptor {
        return HttpSessionHandshakeInterceptor()
    }
}