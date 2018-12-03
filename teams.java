import java.util.Scanner;
import java.util.Random;

public class teams extends scheduler
{
  Scanner keyboard = new Scanner(System.in);
  Random generator = new Random();
  
  private String[] team = {"Jaguars", "Sharks", "Vultures", "Kangaroos"};
  private int win, loss, tie, points, allowed;
  private String name;

  
  public teams(String teamname){
    name = teamname;
    win = 0;
    loss = 0;
    tie = 0;
    points = 0;
    allowed = 0;
  }
  
  public void addWin(){
    win++;
  }
  
  public void addLoss(){
    loss++;
  }
  
  public void addTie(){
    tie++;
  }

  public void addPoints(){
    points += points;
  }
  
  public void allowedPoints(){
    allowed += allowed;
  }

  public int calculatePoints(){
      getWeather();
      if (temperature >= 80){
        points = generator.nextInt(10);
      }else if ((temperature < 80) && (temperature > 50)){
        points = generator.nextInt(6);
      }else if (temperature <= 50){
        points = 0;
      }
  return points;
  }

  public String toString(){
    String results = "Team: " + name + ", Wins: " + win + ", Losses: " + loss + ", Ties: " + tie;
    results += "\nPoints Scored: " + points + ", Points Allowed: " + allowed;
   
    return results;
  }
}
       
  