#ifndef ESTUDIANTE_H
#define ESTUDIANTE_H
#include <string>
#include <ostream>
using namespace std;
class Estudiante
{
public:
    Estudiante(string name) {nombre=name;}
    virtual string getDescription() const=0;
    friend ostream & operator<<(ostream & os, const Estudiante & e);
    string getNombre() const { return nombre;}
private:
    string nombre;
};


#endif // ESTUDIANTE_H
