package com.data.controller

import com.data.kafka.KafkaService
import com.data.model.Message
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import java.util.*

@Controller
class MessageController(private val kafkaService: KafkaService) {

    @Post
    fun sendMessage(@Body message: Message) {
        kafkaService.sendMessage(UUID.randomUUID().toString(), message)
    }
}