#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int temp=n;
  int c=0;
  while(temp)
  {
    c+=temp%10;
    temp/=10;
  }
  if(n%c==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}