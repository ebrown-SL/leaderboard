package com.leaguetracker.server.mappers;

import com.leaguetracker.server.controller.response.LeagueResponse;
import com.leaguetracker.server.data.League;

public class LeagueMappers {
  public static LeagueResponse toLeagueResponse(League league) {
    return LeagueResponse.builder()
        .LeagueId(league.getId())
        .name(league.getName())
        .challenges(league.getChallengeIds())
        .players(league.getPlayers())
        .leaderboard(league.getLeaderboardList())
        .build();
  }
}
