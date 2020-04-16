#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int a,t;
  cin>>a>>t;
  float b;
  if(a==2)
  {
    b=t+t*.5;
    cout<<setprecision(3)<<b;
  }
  else if(a==3)
  {
    b=t*2;
    cout<<setprecision(3)<<b;
  }
  else
  {
    cout<<"Number of items is more";
  }
}