#include <bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin >> t;

    for (int i = 0; i < t; ++i)
    {
        int n;
        cin >> n;
        string a;
        cin >> a;
        int m;
        cin >> m;
        string b;
        cin >> b;
        string c;
        cin >> c;

        string s = a;
        for (int i = 0; i < m; i++)
        {
            if (c[i] == 'V')
            {
                s = b[i] + s;
            }
            else
            {
                s += b[i];
            }
        }
        cout << s << "\n";
    }
    return 0;
}