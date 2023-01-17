package com.data.kafka

import com.data.model.Message
import io.micronaut.configuration.kafka.annotation.KafkaClient
import io.micronaut.configuration.kafka.annotation.KafkaKey
import io.micronaut.configuration.kafka.annotation.Topic

@KafkaClient
interface KafkaService {

    @Topic("message")
    fun sendMessage(@KafkaKey id:String, message: Message)
}