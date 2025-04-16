package edu.navalkishoreb.centralkafkaservice.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AssociationsDto {
    private Requester requester;
    private RequestedFor requestedFor;

    @Data
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class Requester {
        private String id;
        private String email;
        private String name;
    }

    @Data
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class RequestedFor {
        private String id;
        private String email;
        private String name;
    }
}
