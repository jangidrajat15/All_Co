//Program For Printing Elements in ZIG-ZAG Pattern by Rajat Jangid.

#include <stdio.h>

int main() {
    int n, m;
    printf("Enter order of the matrix: ");
    scanf("%d %d", &n, &m);
    int arr[n][m];

    //For Taking Input from user.
    printf("Enter elements of the matrix row wise: ");
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
            scanf("%d", &arr[i][j]);
        }
    }
    //For Printing Given Matrix
    printf("Your Matrix is given by : \n");
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }
    printf("\n");

    //For Printing in Zig Zag Pattern
    int i = 0;
    int j = 0;
    int check = 0;
    printf("%d ", arr[0][0]);
    while (1) {
        if (check == 0) {
            if (i == 0 || j == m - 1) {
                if (j == m - 1) i++;
                else j++;
                printf("%d ", arr[i][j]);
                if (i == n - 1 && j == m - 1) break;
                check = 1;
            } else {
                i--;
                j++;
                printf("%d ", arr[i][j]);
            }
        } else {
            if (j == 0 || i == n - 1) {
                if (i == n - 1) j++;
                else i++;
                printf("%d ", arr[i][j]);
                if (i == n - 1 && j == m - 1) break;
                check = 0;
            } else {
                i++;
                j--;
                printf("%d ", arr[i][j]);
            }
        }
    }
    return 0;
}
