#include<stdio.h>
int main(){
    int shivam;
    a:
    printf("\n");
    printf("1.addition\n");
    printf("2.subtract\n");
    printf("3.division\n");
    printf("4.multiplye\n");
   
    printf("Enter the 1 to 4 numbers : ");
    scanf("%d",&shivam);
    printf("\n");
    switch (shivam)
    {
    case 1:{
        int a,b;
        printf("enter the fisrt numbers : ");
        scanf("%d",&a);
        printf("enter the second numbers  : ");
        scanf("%d",&b);
        printf("Resultant : %d",a+b);
         printf("\n");
        break;
    }
    case 2:{
        int a,b;
        printf("enter the fisrt numbers : ");
        scanf("%d",&a);
        printf("enter the second numbers  : ");
        scanf("%d",&b);
        printf("Resultant : %d",a-b);
         printf("\n");
        break;
    }
    case 3:{
         float a,b;
        printf("enter the float numbers : ");
        scanf("%f",&a);
        printf("enter the float numbers  : ");
        scanf("%f",&b);
        printf("Resultant : %f",a/b);
        printf("\n");
        break;
    }
    case 4:{
         int a,b;
        printf("enter the fisrt numbers : ");
        scanf("%d",&a);
        printf("enter the second numbers  : ");
        scanf("%d",&b);
        printf("Resultant : %d",a*b);
         printf("\n");
        break;
    }
    
    default:
    printf("enter the correct no  ");
       goto a;
        break;
    }
}