#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,t;
  cin>>r>>c>>t;
  int a=t%10;
  int b=t/10;
  if(t%c==0)
  {
    cout<<"Yes";
  }
  else
  {
    if(t<c)
    {
      cout<<"Yes";
    }
    else
    {
      if((t-1)%5==0)
      {
        cout<<"Yes";
      }
      else
      {
        cout<<"No";
      }
    }
  }
}