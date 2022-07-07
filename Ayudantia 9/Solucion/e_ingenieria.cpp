#include "e_ingenieria.h"

E_ingenieria::E_ingenieria(string name, string carrera):Estudiante(name){
  this->carrera=carrera;
}

string E_ingenieria::getDescription() const{
  return getNombre()+" es estudiante de "+carrera+".";
}
