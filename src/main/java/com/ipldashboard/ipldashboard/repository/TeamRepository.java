package com.ipldashboard.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import com.ipldashboard.ipldashboard.Model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>  {

    Team findByTeamName(String teamName);
}
