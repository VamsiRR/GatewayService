package com.vamsi.gatewayservice.authenticate;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Predicate;

@Component
public class RouteValidator {
    public static List<String> endPoints = List.of();

    public Predicate<ServerHttpRequest> isSecured =
            request -> endPoints
                    .stream()
                    .noneMatch(uri -> request.getURI().getPath().contains(uri));
}
