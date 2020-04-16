#include<iostream>
using namespace std;
int main()
{
  int k;
  cin>>k;
  int n=0;
  int temp=k;
  while(temp)
  {
    n++;
    temp/=10;
  }
  temp=k*k;
  int d=1;
  while(n)
  {
    d*=10;
    n--;
  }
  int a=temp%d;
  int b=temp/d;
  temp=a+b;
  if(temp==k)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
}