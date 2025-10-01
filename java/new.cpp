#include <iostream>

using namespace std;

void findPair(int arr[], int n, int targetSum) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i] + arr[j] == targetSum) {
                cout << "Pair found: (" << arr[i] << ", " << arr[j] << ")" << endl;
                return; 
            }
        }
    }
    cout << "No pair found!" << endl;
}

int main() {
    int arr[] = {-1, 1, 0, 3, -2, 2}; // Example array
    int n = sizeof(arr) / sizeof(arr[0]);
    int targetSum = 2;

    findPair(arr, n, targetSum);

    return 0;
}
