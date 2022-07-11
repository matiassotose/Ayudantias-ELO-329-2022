
#include <iostream>
using namespace std;

struct cod {
    int digit;
    cod* connection;
};

cod* createSequence(int length);

void connectSequences(cod*, int, cod*, int);
void showCRYPT(cod*, int);

int main()
{

    int l1 = 4;
    int l2 = 10; 
    cod* h1 = createSequence(l1);

    cod* h2  = createSequence(l2);
    connectSequences(h1, l1, h2, l2);

    showCRYPT(h2, l2);
    return 0;
}

cod* createSequence(int length) {
    cod* ptemp = new cod[length];
    int numero = 0;
    for (int i = 0; i < length; i++) {
        (ptemp + i)->connection = NULL;
    }

    for (int i = 0; i < length; i++) {
        cout << "Ingrese numero: ";
        cin >> numero;
        switch (numero) {
        case 0:
            (ptemp + i)->digit = numero;
            break;
        case 1:
            (ptemp + i)->digit = numero;
            break;
        case 2:
            (ptemp + i)->digit = numero;
            break;
        case 3:
            (ptemp + i)->digit = numero;
            break;
        default:
            i--;
        }
    }
    return ptemp;
}


void connectSequences(cod* h1, int l1, cod* h2, int l2) {
    if (l1 < l2) {
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {
                if ((h1+i)->connection==NULL && (h2+j)->connection==NULL) {
                    if ((h1 + i)->digit == 0 && (h2 + j)->digit == 2) {
                        (h1 + i)->connection = (h2 + j);
                        (h2 + j)->connection = (h1 + i);
                    }
                    else if ((h1 + i)->digit == 2 && (h2 + j)->digit == 0) {
                        (h1 + i)->connection = (h2 + j);
                        (h2 + j)->connection = (h1 + i);
                    }
                    else if ((h1 + i)->digit == 1 && (h2 + j)->digit == 3) {
                        (h1 + i)->connection = (h2 + j);
                        (h2 + j)->connection = (h1 + i);
                    }
                    else if ((h1 + i)->digit == 3 && (h2 + j)->digit == 1) {
                        (h1 + i)->connection = (h2 + j);
                        (h2 + j)->connection = (h1 + i);
                    }
                }
            }
        }
    }
    else if (l2 < l1) {
        for (int j = 0; j < l1; j++) {
            for (int i = 0; i < l2; i++) {
                if ((h1 + i)->connection == NULL && (h2 + j)->connection == NULL) {
                    if ((h1 + i)->digit == 0 && (h2 + j)->digit == 2) {
                        (h1 + i)->connection = (h2 + j);
                        (h2 + j)->connection = (h1 + i);
                    }
                    else if ((h1 + i)->digit == 2 && (h2 + j)->digit == 0) {
                        (h1 + i)->connection = (h2 + j);
                        (h2 + j)->connection = (h1 + i);
                    }
                    else if ((h1 + i)->digit == 1 && (h2 + j)->digit == 3) {
                        (h1 + i)->connection = (h2 + j);
                        (h2 + j)->connection = (h1 + i);
                    }
                    else if ((h1 + i)->digit == 3 && (h2 + j)->digit == 1) {
                        (h1 + i)->connection = (h2 + j);
                        (h2 + j)->connection = (h1 + i);
                    }
                }
            }
        }
    }
}

void showCRYPT(cod* h2, int l2) {
    for (int i = 0; i < l2; i++) {
        if ((h2 + i)->connection != NULL) {
            cout << (h2 + i)->connection->digit;
        }
        else if ((h2 + i)->connection == NULL) {
            cout << (h2 + i)->digit;
        }
    }
}
