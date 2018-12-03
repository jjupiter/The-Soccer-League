public class SoccerGame
{
  public static void main (String[] args)
  {
    games newGame = new games();
    teams team1 = new teams("Jaguars");
    teams team2 = new teams("Sharks");
    teams team3 = new teams("Vultures");
    teams team4 = new teams("Kangaroos");
    
    //team1.setWeather();
    //team2.setWeather();
    
    team1.calculatePoints();
    team1.addPoints();
    team1.addWin();
    team1.addLoss();
    
    team2.calculatePoints();
    team2.addPoints();
    team2.addWin();
    team2.addLoss();
    
    System.out.println(team1);
    System.out.println(team2);
/*
    do{
      getMatchup();
      getWeather();
      getScore();
      calculateScores();
      addGame();
    }while (freeze < 3)
      
      System.out.println(results);
     */ 
  }
}