package ttLadder.dao;

import java.io.*;

import java.util.*;

public class LadderV2 implements Serializable {
  private static final long serialVersionUID = 1L;

  public List<PlayerV2> playerList;
  public List<ChallengeV2> challengeList;
  public int maxNumOfOpponents;
  public int numOfDaysToUpdate;
  public int numExtraDaysPerChallenge;
  public boolean simultaneousChallengesAllowed;
  public boolean newPlayersAtBottom;
  public int forfeitScore;
  public String host;
  public String pageTitle;

  public List<AnnouncementV2> announcements;
}
