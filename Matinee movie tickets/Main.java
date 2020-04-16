#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  float b;
  float d=13.30;
  cin>>a>>b;
  if(a>13)
  {
    if(b==d)
    {
      cout<<"$5.00";
    }
    else
    {
      cout<<"$8.00";
    }
  }
  else
  {
    if(b==d)
    {
      cout<<"$2.00";
    }
    else
    {
      cout<<"$4.00";
    }
  }
}