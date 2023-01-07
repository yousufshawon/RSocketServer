package com.ayousuf.rsocketserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.codec.json.Jackson2JsonDecoder;
import org.springframework.http.codec.json.Jackson2JsonEncoder;
import org.springframework.messaging.rsocket.RSocketStrategies;

/**
 * Created by IntelliJ IDEA.
 * User:  Yousuf
 * Company:
 * Email:
 * Date:  7/1/23
 * To change this template use File | Settings | File and Code Templates.
 */

@Configuration
public class RSocketConfig {
    @Bean
    public RSocketStrategies getSocketStrategies() {
        return RSocketStrategies.builder()
                .encoders(encoders -> encoders.add(new Jackson2JsonEncoder()))
                .decoders(decoders -> decoders.add(new Jackson2JsonDecoder()))
                .build();
    }
}
