#include<iostream>
using namespace std;
struct feet
{
  int f;
  float i;
}f1,f2;
int main()
{
  //Type your code here.
  cin>>f1.f>>f1.i>>f2.f>>f2.i;
  f1.f+=f2.f;
  f1.i+=f2.i;
  if(f1.i>12)
  {
    f1.i-=12;
    f1.f+=1;
  }
  cout<<f1.f<<"\'-"<<f1.i<<"\"";
}
