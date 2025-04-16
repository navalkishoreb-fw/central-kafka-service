package edu.navalkishoreb.centralkafkaservice.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ModelPropertiesDto {
    private Long id;
    private String subject;
    private String requesterId;
    private String dueBy;
    private String ticketType;
    private int displayId;
    private String humanDisplayId;
    private Status status;
    private Source source;
    private String model;

    @Data
    public static class Status {
        private int id;
        private String name;
    }

    @Data
    public static class Source {
        private int id;
        private String name;
    }
}
