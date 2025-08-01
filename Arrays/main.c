#include <stdio.h>
#include <stdlib.h>
int main() {
  char *str="HelloWorld";
  char str1[11];
  
  
  for(int i = 0; str[i] != '\0'; i++) {
    str1[i] = str[i] & 127;
    printf("%c", str1[i]);
  }
  printf("\n");

  for(int i = 0; str[i] != '\0'; i++) {
    str1[i] = str[i] | 127;
    printf("%c", str1[i]);
  }
  printf("\n");

  for(int i = 0; str[i] != '\0'; i++) {
    str1[i] = str[i] ^ 127;
    printf("%c", str1[i]);
  }

  printf("\n");
}