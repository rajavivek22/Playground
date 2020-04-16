#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  a+=c;
  b+=d;
  while(b>=100)
  {
    b-=100;
    a++;
  }
  cout<<a<<"\n"<<b;
}