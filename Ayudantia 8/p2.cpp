#include <iostream>
using namespace std;

struct cod {
    int digit;
    cod* connection;
};

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
