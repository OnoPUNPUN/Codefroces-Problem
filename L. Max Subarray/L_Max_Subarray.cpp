#include <stdio.h>
#include <iostream>
#include <climits>
#include <algorithm>

using namespace std;


int maxSubarray(int* arr, int n){
    int maxSum = INT_MIN;
    int currentSum = 0;

    for(int i = 0; i < n; i++){
        currentSum += arr[i];
        maxSum = max(maxSum, currentSum);
        if(currentSum < 0){
            currentSum = 0;
        }
    }
    
    return maxSum;
}

int main(){
    
}