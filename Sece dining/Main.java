#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  int a;
  cin>>s>>a;
  if(a==1)
  {
    if(s=="front")
    {
      cout<<"Left Handed";
    }
    else
    {
      cout<<"Right Handed";
    }
  }
  else
  {
    if(s=="front")
    {
      cout<<"Right Handed";
    }
    else
    {
      cout<<"Left Handed";
    }
  }
}