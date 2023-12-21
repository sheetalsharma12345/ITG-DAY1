#include<stdio.h>
int a,b,c;
int AOF(){
    printf("Enter the length of rectangle\n");
    scanf("%d", &a);
    printf("Enter the breath of rectangle\n");
    scanf("%d", &b);
    printf("The area of rectangle is %d", a*b);

}

int main(){
  AOF();
}