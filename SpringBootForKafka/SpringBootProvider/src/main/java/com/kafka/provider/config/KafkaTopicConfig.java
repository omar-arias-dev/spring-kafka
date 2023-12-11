package com.kafka.provider.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.config.TopicConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaTopicConfig {

    public NewTopic generateTopic() {

        Map<String, String> configurations = new HashMap<>();
        //Delete the message. Compact keep newest.
        configurations.put(TopicConfig.CLEANUP_POLICY_CONFIG, TopicConfig.CLEANUP_POLICY_DELETE);
        //Time by deleting messages.
        configurations.put(TopicConfig.RETENTION_MS_CONFIG, "86400000");
        //Max size for segment (1GB).
        configurations.put(TopicConfig.SEGMENT_BYTES_CONFIG, "1073741824");
        //Max size for each message. By default, is 1MB.
        configurations.put(TopicConfig.MAX_MESSAGE_BYTES_CONFIG, "1000002");

        return TopicBuilder.name("Topic-OmarAriasDev")
                .partitions(2)
                .replicas(2)
                .configs(configurations)
                .build();
    }
}
