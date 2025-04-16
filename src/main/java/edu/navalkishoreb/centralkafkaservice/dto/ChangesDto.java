package edu.navalkishoreb.centralkafkaservice.dto;

import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ChangesDto {
    private ModelChanges modelChanges;

    @Data
    public static class ModelChanges {
        private List<Integer> status;
        private List<Integer> ownerId;
        private List<String> dueDate;
        private List<Boolean> deleted;
    }
}
