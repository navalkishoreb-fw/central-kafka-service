package edu.navalkishoreb.centralkafkaservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@SuperBuilder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public abstract class BaseJourneyPayload {
    @NonNull
    @JsonProperty(value = "account_id", required = true)
    protected String accountId;

    @JsonProperty(value = "payload_type", required = true)
    protected  String payloadType;

    @JsonProperty(value = "payload_version", required = true)
    protected String payloadVersion;

    // Enforce setting payloadType and payloadVersion in subclasses
    public abstract String getPayloadType();

    public abstract String getPayloadVersion();
}
