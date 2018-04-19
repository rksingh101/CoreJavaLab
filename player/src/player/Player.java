package player;

public class Player {
         private String name;
         private Game game[];
         public Game[] getGame()
         {
        	 return game;
         }
         public void setGame(Game[] game)
         {
        	 this.game = game;
         }
         public void setPlayerName(String name)
         {
        	 this.name = name;
         }
         public String getPlayerName()
         {
        	 return name;
         }
}
