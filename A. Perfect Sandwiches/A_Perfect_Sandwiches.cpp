#include <iostream>
using namespace std;

int main()
{
    int t;
    scanf_s("%d", &t);

    while (t--)
    {
        int a, b;
        scanf_s("%d%d", &a, &b);

        int diff = a - b;

        if (diff <= 0)
        {
            printf_s("%d\n", -1);
        }
        else
        {
            printf_s("%d\n", min(b, diff));
        }
    }
}