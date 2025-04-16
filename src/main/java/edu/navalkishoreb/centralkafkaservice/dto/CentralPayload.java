package edu.navalkishoreb.centralkafkaservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CentralPayload<P> {
        @JsonProperty("data")
        private CentralData<P> data;
    }
