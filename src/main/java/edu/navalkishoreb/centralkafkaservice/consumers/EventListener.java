package edu.navalkishoreb.centralkafkaservice.consumers;

import com.freshworks.boot.kafka.CentralListener;
import com.freshworks.boot.kafka.dto.central.EventDto;
import edu.navalkishoreb.centralkafkaservice.dto.TodoDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EventListener {
    @CentralListener(messageSelectors = "freshservice:catalog_category_create:*", messageFilterEnabled = false)
    public void handleEvent(EventDto<TodoDto, Void, Void, Void> eventDto) {
        log.info("Received event {}", eventDto);
    }
}
