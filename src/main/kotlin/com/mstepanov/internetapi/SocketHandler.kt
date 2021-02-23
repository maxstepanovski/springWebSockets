package com.mstepanov.internetapi

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import org.springframework.web.socket.CloseStatus
import org.springframework.web.socket.WebSocketMessage
import org.springframework.web.socket.WebSocketSession
import org.springframework.web.socket.handler.TextWebSocketHandler

@Component
class SocketHandler : TextWebSocketHandler() {
    private val logger = LoggerFactory.getLogger(SocketHandler::class.java)

    override fun afterConnectionEstablished(session: WebSocketSession) {
        logger.debug("afterConnectionEstablished")
    }

    override fun handleMessage(session: WebSocketSession, message: WebSocketMessage<*>) {
        logger.debug("handleMessage")
    }

    override fun handleTransportError(session: WebSocketSession, exception: Throwable) {
        logger.debug("handleTransportError")
    }

    override fun afterConnectionClosed(session: WebSocketSession, closeStatus: CloseStatus) {
        logger.debug("afterConnectionClosed")
    }

    override fun supportsPartialMessages(): Boolean {
        logger.debug("supportsPartialMessages")
        return false
    }
}