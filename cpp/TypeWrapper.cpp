#include <vector>
#include <iostream>

int main() {
    int arr[5] = {1, 2, 3, 4, 5};
    int size = sizeof(arr) / sizeof(arr[0]);

    for(int i = 0; i < size; i++) {
        std::cout << arr[i] << " ";
    }
    std::cout << "\n";
    // agak sulit untuk menambahkan dan mengurang elemen pada array

    // agar mudah, ubah menjadi vector
    std::vector<int> vec({1, 2, 3, 4, 5});

    // Iterasi pun dapat dimudahkan
    for(int num : vec) {
        std::cout << num << " ";
    }
    std::cout << "\n";

    // menambahkan elemen dimudahkan 
    vec.push_back(6);
    // mengurangi elemen dimudahkan
    vec.erase(vec.begin());

    for(int num : vec) {
        std::cout << num << " ";
    }
    std::cout << "\n";
}