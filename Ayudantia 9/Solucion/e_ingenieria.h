#ifndef E_INGENIERIA_H
#define E_INGENIERIA_H

#include "estudiante.h"
using namespace std;

class E_ingenieria: public Estudiante{
public:
  E_ingenieria(string name, string carrera);
  virtual string getDescription() const;
private:
  string carrera;
};
#endif
