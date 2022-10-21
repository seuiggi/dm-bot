package com.seuiggi

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.seuiggi.plugins.*

fun main() {
    embeddedServer(Netty, port = 3000, host = "0.0.0.0") {
        configureTemplating()
        configureSerialization()
        configureSecurity()
        configureRouting()
    }.start(wait = true)
}
