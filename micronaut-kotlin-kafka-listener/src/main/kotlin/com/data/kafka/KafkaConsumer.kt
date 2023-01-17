package com.data.kafka

import com.data.model.Message
import io.micronaut.configuration.kafka.annotation.KafkaKey
import io.micronaut.configuration.kafka.annotation.KafkaListener
import io.micronaut.configuration.kafka.annotation.Topic


@KafkaListener
class KafkaConsumer {

    @Topic("message")
    fun receiveMessage(@KafkaKey id:String, message: Message){
        println("KafkaKey: $id, Mensagem: $message")
    }
}