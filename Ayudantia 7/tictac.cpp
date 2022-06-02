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
  /* Completar funcion */
  return true;
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
      if(true/* Checkear que la posicion este vacia */){
        enter(row,col,value,board);
        drawBoard(board);
        if(i>=2){
          win = check(board);
          if(win){
            break;
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
  // start(board);
  return 0;
}
