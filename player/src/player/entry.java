package player;

public class entry 
{
public static void main(String[] args)
    {
	Repository repo = new Repository();
	Player player;
	int playerCount=0,count=0;
	//Player1
	 Game games1[] = new Game[10];
	        player = new Player();
			player.setPlayerName("RK");
			games1[count] = new Game();
			games1[count++].setName("Tennis");
			games1[count] = new Game();
			games1[count++].setName("Cricket");
			games1[count] = new Game();
			games1[count++].setName("Football");
			games1[count] = new Game();
			games1[count].setName("Chess");
			if(count>=2)
			{
				playerCount++;
				player.setGame(games1);
				repo.addPlayer(player, count);
			}
			else
				System.out.println("Invalid Entry No of games have to more than 2");
			
			count=0;
			
	//Player2
			Game games2[] = new Game[10];
			player = new Player();
			player.setPlayerName("Jammy");
			games2[count] = new Game();
			games2[count++].setName("Croquet");
			games2[count] = new Game();
			games2[count++].setName("Table Tennis");
			games2[count] = new Game();
			games2[count].setName("Sprinting");
			if(count>=2)
			{
				playerCount++;
				player.setGame(games2);
				repo.addPlayer(player, count);
			}
			else
				System.out.println("Invalid Entry No of games have to more than 2");
			
			count=0;
			
			
		//Player3
			Game games3[] = new Game[10];
			player = new Player();
			player.setPlayerName("Stan Smith");
			games3[count] = new Game();
			games3[count++].setName("Tennis");
			games3[count] = new Game();
			games3[count++].setName("Hockey");
			games3[count] = new Game();
			games3[count++].setName("Football");
			games3[count] = new Game();
			games3[count].setName("Baseball");
			if(count>=2)
			{
				playerCount++;
				player.setGame(games3);
				repo.addPlayer(player, count);
			}
			else
				System.out.println("Invalid Entry No of games have to more than 2");
			
			count=0;

			//Player4
			Game games4[] = new Game[10];
			player = new Player();
			player.setPlayerName("Roger Fred");
			games4[count] = new Game();
			games4[count++].setName("Tennis");
			games4[count] = new Game();
			games4[count++].setName("Skating");
			games4[count] = new Game();
			games4[count++].setName("Football");
			games4[count] = new Game();
			games4[count++].setName("Carrom");
			games4[count] = new Game();
			games4[count++].setName("Skating");
			games4[count] = new Game();
			games4[count++].setName("Long Board");
			games4[count] = new Game();
			games4[count].setName("Skydiving");
			if(count>=2)
			{
				playerCount++;
				player.setGame(games4);
				repo.addPlayer(player, count);
			}
			else
				System.out.println("Invalid Entry No of games have to more than 2");
			
			count=0;
	
			//Player5
			Game games5[] = new Game[10];
			player = new Player();
			player.setPlayerName("Hannah Stone");
			games5[count] = new Game();
			games5[count++].setName("Ice Hockey");
			games5[count] = new Game();
			games5[count++].setName("Skating");
			games5[count] = new Game();
			games5[count].setName("Football");
			if(count>=2)
			{
				playerCount++;
				player.setGame(games5);
				repo.addPlayer(player, count);
			}
			else
				System.out.println("Invalid Entry No of games have to more than 2");
			
			count=0;

			//Player6 Invalid Test Case 
			Game games6[] = new Game[10];
			player = new Player();
			player.setPlayerName("Valentine John");
			games6[count] = new Game();
			games6[count].setName("Tennis");
			if(count>=2)
			{
				playerCount++;
				player.setGame(games6);
				repo.addPlayer(player, count);
			}
			else
				System.out.println("Invalid Entry No of games have to more than 2");
			
			count=0;

			
		//display valid inputs
			for(int i =0;i<playerCount;i++)
			{
				repo.displayPlayerDetails(i);
			}
		
	}
}
