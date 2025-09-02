#include<iostream>
using namespace std;

bool isManage(string word) {
    string h = "hello";
    int j = 0, pass = 0;

    for(int i = 0; i < word.length(); i++) {
        if(word[i] == h[j]) {
            j++;
            pass++;
        }
    }
    if(pass == 5) {
        return true;
    }

    return false;
}

int main() {
    string word;
    cin >> word;

    if(isManage(word)) {
        cout << "YES";
    } else {
        cout << "NO";
    }
}