package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Team> {

  private String name;
  private List<T> teams = new ArrayList<>();

  public League(String name) {
    this.name = name;
  }

  public void addTeam(T team) {

    if (!teams.contains(team)) {
      teams.add(team);
    }
  }

  public void printRanking() {
    Collections.sort(teams);
    teams.forEach(team -> System.out.println(team.getName() + " : " + team.ranking()));
  }


}
