#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int a=1;
  int b=0;
  int c=0;
  while(n)
  {
    c=a+b;
    a=b;
    b=c;
    n--;
  }
  cout<<a;
}