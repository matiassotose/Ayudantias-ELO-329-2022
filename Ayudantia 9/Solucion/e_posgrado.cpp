#include "e_posgrado.h"


E_posgrado::E_posgrado(string name, int numPub):Estudiante(name){
  this->numPub = numPub;
}

string E_posgrado::getDescription() const{
  return getNombre()+" es estudiante de posgrado con "+to_string(numPub)
  +" publicaciones.";
}

bool E_posgrado::operator<(const E_posgrado &ep){
  return numPub < ep.numPub;
}
