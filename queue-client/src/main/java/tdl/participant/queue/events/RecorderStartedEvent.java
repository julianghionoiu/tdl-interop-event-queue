package tdl.participant.queue.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;
import tdl.participant.queue.connector.QueueEvent;

@Value
@QueueEvent(name = "recorderStarted", version = "0.2")
public class RecorderStartedEvent implements ParticipantEvent {
    private final long timestampMillis;
    private final String participant;
    private final String challengeId;

    public RecorderStartedEvent(@JsonProperty("timestampMillis") long timestampMillis,
                                @JsonProperty("participant") String participant,
                                @JsonProperty("challengeId") String challengeId) {
        this.timestampMillis = timestampMillis;
        this.participant = participant;
        this.challengeId = challengeId;
    }
}
