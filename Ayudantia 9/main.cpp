
#include <iostream>
#include "estudiante.h"
#include "e_ingenieria.h"
#include "e_posgrado.h"
using namespace std;

int main(int argc, char *argv[])
{

    vector <Estudiante *> comunidad;
    E_ingenieria juan( "Juan", "Ing. Civil Tel");  // nombre, carrera
    E_posgrado claudia("Claudia", 2);  // nombre, número de publicaciones
    comunidad.push_back(&juan);
    comunidad.push_back(&claudia);
    for (unsigned int i=0; i < comunidad.size(); i++){
        cout << *comunidad[i] << endl;
    }
    // El código siguiente sólo impacta en clase E_Posgrado
    E_posgrado pedro("Pedro", 1);
    if (pedro < claudia)
       cout << claudia.getNombre() << " ha publicado más." << endl;
    else
       cout << pedro.getNombre() << " ha publicado al menos lo mismo que " <<
               claudia.getNombre() << endl;
    return a.exec();
}

