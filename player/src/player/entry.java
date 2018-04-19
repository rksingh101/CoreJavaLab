package player;

public class entry 
{
public static void main(String[] args)
    {
	Repository repo = new Repository();
	Player player;
	Game games[];
	int playerCount=0,count=0;
	//Player1
	        games = new Game[10];
	        player = new Player();
			player.setPlayerName("RK");
			games[count] = new Game();
			games[count++].setName("Tennis");
			games[count] = new Game();
			games[count++].setName("Cricket");
			games[count] = new Game();
			games[count++].setName("Football");
			games[count] = new Game();
			games[count].setName("Chess");
			if(count>=2)
			{
				playerCount++;
				player.setGame(games);
				repo.addPlayer(player, count);
			}
			else
				System.out.println("Player "+(playerCount+1)+" Invalid Entry, No of games has to more than 2");
			count=0;
			
	//Player2
			games = new Game[10];
			//Game games2[] = new Game[10];
			player = new Player();
			player.setPlayerName("Jammy");
			games[count] = new Game();
			games[count++].setName("Croquet");
			games[count] = new Game();
			games[count++].setName("Table Tennis");
			games[count] = new Game();
			games[count].setName("Sprinting");
			if(count>=2)
			{
				playerCount++;
				player.setGame(games);
				repo.addPlayer(player, count);
			}
			else
				System.out.println("Player "+(playerCount+1)+" Invalid Entry, No of games has to more than 2");
			count=0;
			
			
		//Player3
			games = new Game[10];
			player = new Player();
			player.setPlayerName("Stan Smith");
			games[count] = new Game();
			games[count++].setName("Tennis");
			games[count] = new Game();
			games[count++].setName("Hockey");
			games[count] = new Game();
			games[count++].setName("Football");
			games[count] = new Game();
			games[count].setName("Baseball");
			if(count>=2)
			{
				playerCount++;
				player.setGame(games);
				repo.addPlayer(player, count);
			}
			else
				System.out.println("Player "+(playerCount+1)+" Invalid Entry, No of games has to more than 2");
			count=0;

			//Player4
			games = new Game[10];
			player = new Player();
			player.setPlayerName("Roger Fred");
			games[count] = new Game();
			games[count++].setName("Tennis");
			games[count] = new Game();
			games[count++].setName("Skating");
			games[count] = new Game();
			games[count++].setName("Football");
			games[count] = new Game();
			games[count++].setName("Carrom");
			games[count] = new Game();
			games[count++].setName("Skating");
			games[count] = new Game();
			games[count++].setName("Long Board");
			games[count] = new Game();
			games[count].setName("Skydiving");
			if(count>=2)
			{
				playerCount++;
				player.setGame(games);
				repo.addPlayer(player, count);
			}
			else
				System.out.println("Player "+(playerCount+1)+" Invalid Entry, No of games has to more than 2");
			count=0;
	
			//Player5
			games = new Game[10];
			player = new Player();
			player.setPlayerName("Hannah Stone");
			games[count] = new Game();
			games[count++].setName("Ice Hockey");
			games[count] = new Game();
			games[count++].setName("Skating");
			games[count] = new Game();
			games[count].setName("Football");
			if(count>=2)
			{
				playerCount++;
				player.setGame(games);
				repo.addPlayer(player, count);
			}
			else
				System.out.println("Player "+(playerCount+1)+" Invalid Entry, No of games has to more than 2");
			count=0;

			//Player6 Invalid Test Case 
			games = new Game[10];
			player = new Player();
			player.setPlayerName("Valentine John");
			games[count] = new Game();
			games[count].setName("Tennis");
			if(count>=2)
			{
				playerCount++;
				player.setGame(games);
				repo.addPlayer(player, count);
			}
			else
				System.out.println("Player "+(playerCount+1)+" Invalid Entry, No of games has to more than 2");
			
			count=0;

			
		//display valid inputs
			for(int i =0;i<playerCount;i++)
			{
				repo.displayPlayerDetails(i);
			}
		
	}
}
