package com.leaguetracker.server.controller.response;

import com.leaguetracker.server.data.ChallengeResult;
import com.leaguetracker.server.data.ChallengeState;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChallengeResponse {
    private String challengeId;
    private String challenger;
    private String challenged;
    private ChallengeResult result;
    private ChallengeState state;
}
