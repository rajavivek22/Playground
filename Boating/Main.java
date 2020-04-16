#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int b;
  int a;
  int c;
  int aw=75;
  int cw=30;
  cin>>b>>a>>c;
  aw*=a;
  cw*=c;
  if((aw+cw)>b)
  {
    cout<<"Boat will drow";
  }
  else
  {
    cout<<"Boat is stable";
  }
}