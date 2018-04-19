package player;

public class Repository {
	  private int pos;
      private Player[] players = new Player[5];
      private Game[] games;
      private int gameCount[] = new int[5];
      public void addPlayer(Player player, int gameCounter)
      {
    	  players[pos] = player;
    	  gameCount[pos] = gameCounter;
          pos++;
      }
      public void displayPlayerDetails(int pos)
      {
    	  //System.out.println(gameCount[pos]);
    	  games = players[pos].getGame();
    	  System.out.println("Player Name: "+players[pos].getPlayerName());
    	  for(int i=0 ; i <=gameCount[pos] ; i++)
  		{	
  			System.out.println("Game "+(i+1)+" : " + games[i].getName());
  		}
    	  System.out.println();
    	  
      }
}
