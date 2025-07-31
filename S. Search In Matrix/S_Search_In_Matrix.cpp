#include <iostream>
using namespace std;

int main() {
    int N, M;
    cin >> N >> M;
    
    int** matrix = new int*[N];
    for(int i = 0; i < N; i++) {
        matrix[i] = new int[M];
    }
    
    for(int i = 0; i < N; i++) {
        for(int j = 0; j < M; j++) {
            cin >> matrix[i][j];
        }
    }
    
    int X;
    cin >> X;
    
    bool found = false;
    for(int i = 0; i < N && !found; i++) {
        for(int j = 0; j < M; j++) {
            if(matrix[i][j] == X) {
                found = true;
                break;
            }
        }
    }
    
    if(found) {
        cout << "will not take number" << endl;
    } else {
        cout << "will take number" << endl;
        
    }
    
    for(int i = 0; i < N; i++) {
        delete[] matrix[i];
    }
    delete[] matrix;
    
    return 0;
}