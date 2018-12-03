import java.util.*;

public class scheduler
{ 
  Scanner keyboard = new Scanner(System.in);
  Random generator = new Random();
  
  private teams team;
  private int score, freeze, temperature;
  private String team1, team2;
  private ArrayList<Integer> game = new ArrayList<Integer>();
   
  public void warmDay(){
    restart:while(true){
    if (temperature > 50){
      game.add(1);
      game.add(2);
      freeze = 0;
    }else{
      System.out.println("Too cold to play");
      freeze++;
      if (freeze == 3){
        System.out.println("Season is over");
      }
      continue restart;
    }
   }
  }
  
  public void getMatchup(){
    do{
      int i = generator.nextInt(4);
      team[i] = team1;
      i = generator.nextInt(4);
      team[i] = team2;
    }while(team1 == team2);
    
  }
  
  //asks the user for weather input in the form of temperature
   public void setWeather()
  {    
    System.out.println("Please enter the temperature (in fahrenheit): ");
    temperature = keyboard.nextInt();
   }
   
   //returns the value of temperature
   public int getWeather(){
    return temperature;
  }
}