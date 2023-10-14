package org.project2.userservice.configuration.kafka;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerInterceptor;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.protocol.types.Field;
import org.project2.userservice.model.User;

import java.util.Map;

@Slf4j
public class ParitionIndexingInterceptor implements ProducerInterceptor<String, User> {
    @Override
    public ProducerRecord<String, User> onSend(ProducerRecord<String, User> record) {
        log.info("Message was sent to partition "+ record.partition());
        return record;
    }

    @Override
    public void onAcknowledgement(RecordMetadata metadata, Exception exception) {

    }

    @Override
    public void close() {

    }

    @Override
    public void configure(Map<String, ?> configs) {

    }
}
