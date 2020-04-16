#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int l,r;
  cin>>r>>l;
  r*=2;
  if(l>=r)
  {
    cout<<"circle can be inside a square";
  }
  else
  {
    cout<<"circle cannot be inside a square";
  }
}