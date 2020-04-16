#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int c,d,p;
  float a,b,e,f,g,i,r,y;
  cin>>a>>b>>c>>d;
  e=a/6;
  f=d/6;
  g=d%6;i=f+(g*0.1);
  r=c/i;
  y=b/e;
  if(r>10)
    p=3;
  else
    p=2;
  cout<<e<<"\n"
    <<i<<"\n"
    <<setprecision(p)<<r<<"\n"
    <<y<<"\n";
  if(r>y)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
}