#ifndef E_POSGRADO
#define E_POSGRADO

#include "estudiante.h"

class E_posgrado: public Estudiante{
public:
  E_posgrado(string name, int numPub);
  virtual string getDescription() const;
  bool operator<(const E_posgrado &ep);
private:
  int numPub;
};

#endif
