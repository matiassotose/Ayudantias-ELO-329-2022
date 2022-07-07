#include "estudiante.h"

ostream & operator<<(ostream & os, const Estudiante & e){
  os<<e.getDescription();
  return os;
}
