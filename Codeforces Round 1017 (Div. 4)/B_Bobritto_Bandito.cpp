#include<iostream>

using namespace std;


int main() {
    int t;

    while(t--) {
        int n, m, l, r;

        cin >> n >> m >> l >> r;

        int x = 0;
        int y = 0;

        for(int i = 0; i < m; i++) {
            if(y - 1 >= l) {
                --y;
            } else {
                ++x;

                x = min(x, r);
            }
        }
    }
}