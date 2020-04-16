#include<iostream>
using namespace std;
struct s
{
  int r;
  int i;
};
int main()
{
  struct s s1,s2;
  int n;
  cin>>n;
  int a,b;
  cin>>s1.r>>s1.i>>s2.r>>s2.i;
  if(n==1)
  {
    a=s1.r+s2.r;
    b=s1.i+s2.i;
  }
  else if(n==2)
  {
    a=s1.r-s2.r;
    b=s1.i-s2.i;
  }
  else if(n==3)
  {
    a=s1.r*s2.r-s1.i*s2.i;
    b=s1.r*s2.i+s1.i*s2.i;
  }
  else
  {
    cout<<"Invalid choice";
    exit(0);
  }
  cout<<a;
  if(b>=0)
    cout<<"+"<<b<<"i";
  else
    cout<<b<<"i";
}
