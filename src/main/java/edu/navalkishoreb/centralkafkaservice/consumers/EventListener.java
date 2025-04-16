package edu.navalkishoreb.centralkafkaservice.consumers;

import com.freshworks.boot.common.context.account.AccountContext;
import com.freshworks.boot.kafka.CentralListener;
import edu.navalkishoreb.centralkafkaservice.dto.Account;
import edu.navalkishoreb.centralkafkaservice.dto.CentralPayload;
import edu.navalkishoreb.centralkafkaservice.dto.JourneyInitiationPayload;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

//import com.freshworks.boot.sdk.kafka.model.CentralPayload;
;

@Slf4j
@Service
public class EventListener {
    private final AccountContext<Account> accountContext;

    public EventListener(AccountContext<Account> accountContext) {
        this.accountContext = accountContext;
    }
//    @CentralListener(messageSelectors = "freshservice:ticket_update:*", messageFilterEnabled = false)
//    public void handleTicketUpdate(EventDto<ModelPropertiesDto, AssociationsDto, ActorDto, ChangesDto> eventDto) {
//        log.info("Received event {}", eventDto);
//        int finalStatus = eventDto.getData().getPayload().getChanges().getModelChanges().getStatus().get(1);
//    }
//
//    @CentralListener(messageSelectors = "freshservice:task_update:*", messageFilterEnabled = false)
//    public void handleTaskUpdate(EventDto<ModelPropertiesDto, AssociationsDto, ActorDto, ChangesDto> eventDto) {
//        log.info("Received event {}", eventDto);
//        int finalStatus = eventDto.getData().getPayload().getChanges().getModelChanges().getStatus().get(1);
//    }

    @CentralListener(messageSelectors = "freshservice:journey_request_initiate:*", messageFilterEnabled = false)
    public void processCreate(CentralPayload<JourneyInitiationPayload> eventDto) {
        System.out.println(eventDto);
        System.out.println(accountContext.get().getAccountId());

    }
}
