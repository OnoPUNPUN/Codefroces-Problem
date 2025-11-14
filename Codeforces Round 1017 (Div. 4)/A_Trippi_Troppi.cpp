#include<iostream>
#include<sstream>
using namespace std;

int main() {
    int t;

    cin >> t;

    while(t--) {
        string c;

        cin >> c;
        stringstream ss(c);
        string word;
        string r;

        while(ss >> word) {
            if(!word.empty()) {
                r += word[0];
            }
        }

        cout << r;
        cout << " ";
    }
    cout << endl;

    return 0;
}