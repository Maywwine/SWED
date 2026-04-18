#include <stdio.h>
#include <stdbool.h>

bool check_collatz(long long n) {
    while (n != 1) {
        if (n % 2 == 0) {
            n = n / 2;
        } else {
            n = 3 * n + 1;
        }
    }
    return true;
}

int main() {
    const int LIMIT = 1000000; // Set a reasonable limit to prevent infinite loops
    long long n;
    printf("Enter a positive integer: ");
    scanf("%lld", &n);

    if (n <= 0) {
        printf("Please enter a positive integer.\n");
        return 1;
    }

    if (check_collatz(n)) {
        printf("proven for %lld.\n", n);
    } else {
        printf("The Collatz conjecture does not hold for %lld.\n", n);
    }

    return 0;
}