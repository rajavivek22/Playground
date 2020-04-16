#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,n;
  cin>>r>>c>>n;
  int c1=c;
  int c2=c*2;
  int c3=c*(r-2);
  int c4=c*(r-1);
  if((n>c1 && n<=c2 )||(n>c3 && n<=c4))
  {
    cout<<"It is a mango tree";
  }
  else
  {
    cout<<"It is not a mango tree";
  }
}