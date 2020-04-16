#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y;
  cin>>x>>y;
  int a=3;
  int b=4;
  x-=a;
  y-=b;
  if(x>y)
  {
    cout<<x;
  }
  else
  {
    cout<<y;
  }
}