package com.ayousuf.rsocketserver;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

/**
 * Created by IntelliJ IDEA.
 * User:  Yousuf
 * Company:
 * Email:
 * Date:  4/1/23
 * To change this template use File | Settings | File and Code Templates.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    private String message;
    private long created = Instant.now().getEpochSecond();

    public Message(String message) {
        this.message = message;
    }
}