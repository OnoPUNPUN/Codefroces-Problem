
#include<bits/stdc++.h>
using namespace std;

string check(string word) {
    int numLower = 0, numUpper = 0;

    for(char c : word) {
        if(isupper(c)) {
            numUpper++;
        } else {
            numLower++;
        }
    }

    if(numUpper > numLower) {
        transform(word.begin(), word.end(), word.begin(), ::toupper);
        return word;
    }
    transform(word.begin(), word.end(), word.begin(), ::tolower);
    return word;
}

int main() {
    string word;
    cin >> word;

    cout << check(word);
}