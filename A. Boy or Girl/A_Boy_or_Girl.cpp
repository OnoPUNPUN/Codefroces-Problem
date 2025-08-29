#include <bits/stdc++.h>
using namespace std;

bool isGirl(string s)
{
    int l = s.length();
    int count = 0;

    sort(s.begin(), s.end());

    for (int i = 1; i < l; i++)
    {
        if (s[i] != s[i - 1])
        {
            count++;
        }
    }

    if ((count + 1) % 2 == 0)
    {
        return true;
    }
    return false;
}

int main()
{
    string s;
    cin >> s;

    if (isGirl(s))
    {
        cout << "CHAT WITH HER!";
    }
    else
    {
        cout << "IGNORE HIM!";
    }

    return 0;
}