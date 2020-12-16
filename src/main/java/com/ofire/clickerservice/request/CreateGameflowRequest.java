package com.ofire.clickerservice.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public class CreateGameflowRequest {

    private UUID userId;

}
