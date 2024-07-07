#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int id;
    char name[30];
    float grade;
} Student;

void createSequentialFile() {
    FILE *file = fopen("students.txt", "wb");
    if (!file) {
        perror("Unable to create file");
        exit(1);
    }

    Student students[] = {
        {1, "Alice", 85.5},
        {2, "Bob", 90.0},
        {3, "Charlie", 78.5}
    };

    fwrite(students, sizeof(Student), 3, file);
    fclose(file);
}

void readSequentialFile() {
    FILE *file = fopen("students.txt", "rb");
    if (!file) {
        perror("Unable to open file");
        exit(1);
    }

    Student student;
    while (fread(&student, sizeof(Student), 1, file)) {
        printf("ID: %d, Name: %s, Grade: %.2f\n", student.id, student.name, student.grade);
    }
    fclose(file);
}

int main() {
    createSequentialFile();
    readSequentialFile();
    return 0;
}
