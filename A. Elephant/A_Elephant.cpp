#include <iostream>
using namespace std;

int steps(int postion)
{
    if (postion < 0)
    {
        return -1;
    }
    int count = 0;
    int sum = 0;

    for (int i = 0; i < postion; i++)
    {
        if (sum == postion || sum > postion)
        {
            return count;
        }
        else if (postion == 1)
        {
            return 1;
        }
        else
        {
            sum += 5;
            count++;
        }
    }
    return -1;
}

int main()
{
    int p;

    cin >> p;
    cout << steps(p);
}