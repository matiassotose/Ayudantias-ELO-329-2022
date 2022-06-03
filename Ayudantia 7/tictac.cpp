#include <iostream>
#include <vector>


std::vector<std::vector<int>> board;

void drawBoard(std::vector<std::vector<int>> &board){
  std::cout<<"    0   1   2   3   4   \n";
  std::cout<<"  +---+---+---+---+---+\n";

  for (int i=0; i<board.size(); ++i) {
    std::cout<<i<<" ";
    for(int j=0;j<board[i].size();++j){
      std::cout<<"| "<<board[i][j]<<" ";
    }
    std::cout<<"|";
    std::cout<<'\n';
    std::cout<<"  +---+---+---+---+---+\n";
  }
}

void enter(int row, int col, int value, std::vector<std::vector<int>> &board){
  board[row][col] = value;
}

bool check(std::vector<std::vector<int>> &board){

  int j1Counter = 0;
  int j2Counter = 0;

  int i;

  /* Revisar diagonales */

  for(i=0;i<board.size();++i){ // Top Derecha a Izquierda
      if(board[i][i] == 1){
        j1Counter++;
      }
      else if(board[i][i] == 2){
        j2Counter++;
      }
  }
  if(j1Counter==5){
    std::cout<<"Ganador J1\n";
    return true;
  }
  else if(j2Counter==5){
    std::cout<<"Ganador J2\n";
    return true;
  }
  else{
    j1Counter = 0;
    j2Counter = 0;
  }

  for(i=0;i<board.size();++i){ // Top Izquierda a Derecha
      if(board[i][(board.size()-1)-i] == 1){
        j1Counter++;
      }
      else if(board[i][(board.size()-1)-i] == 2){
        j2Counter++;
      }
  }
  if(j1Counter==5){
    std::cout<<"Ganador J1\n";
    return true;
  }
  else if(j2Counter==5){
    std::cout<<"Ganador J2\n";
    return true;
  }


  return false;
}


void start(std::vector<std::vector<int>> &board){

  int row,col;
  bool win;
  int value;

  for (int i = 0; i < 25;) {
    if(i==0||i%2==0){
      value = 1;
      std::cout<<"Juega el jugador 1\n";
    }
    else{
      value = 2;
      std::cout<<"Juega el jugador 2\n";
    }
    std::cout<<"Ingrese el numero de fila: ";
    std::cin>>row;
    std::cout<<"Ingrese el numero de columna: ";
    std::cin>>col;
    if(row<5 && col<5){
      if(board[row][col]==0){
        enter(row,col,value,board);
        drawBoard(board);
        if(i>=2){
          win = check(board);
          if(win){
            return;
          }
        }
        i++;
      }
      else{
        std::cout<<"Esta posicion esta ocupada\n";
      }
    }
    else{
      std::cout<<"Ingrese posiciones entre 0 y 4\n";
    }
  }
  if(!win){
    std::cout<<"Empate!\n";
  }
}


int main(int argc, char const *argv[]) {

  std::vector<std::vector<int>> board(5,std::vector<int>(5,0));
  drawBoard(board);
  start(board);
  return 0;
}
