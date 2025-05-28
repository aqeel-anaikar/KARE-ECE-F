#include<iostream>
#include<windows.h>
#include<unistd.h>
using namespace std;
int main()
{
system("cls");
int a;
cout<<"Enter Table Number";
cin>>a;
for(int i = 1;i<=10;i++){
    cout<<a<<" x "<<i<<" = "<<i*a<<endl;
}
int dummy;
cin>>dummy;
return 0;
}