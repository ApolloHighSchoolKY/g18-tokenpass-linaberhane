public TokenPass(int playerCount){
  /*  to be answered in part (a) */
  int[] board = new int[playerCount];
  currentPlayer = Math.random()*playerCount-1;
  for(int player: board)
  {
    player = Math.random()*10;
  }
  
}

public void distributeCurrentPlayerTokens(){
  /* to be answered in part (b) */
  int tokens = board[currentPlayer];
  if(tokens > 0)
  {
    for(int i = currentPlayer; tokens > 0; i++)
    {
      board[i] = 0;
      board[i+1]++;
    }
  }
}
