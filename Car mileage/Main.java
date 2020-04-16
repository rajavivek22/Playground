#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float m,l,d;
  cin>>m>>l>>d;
  m*=l;
  if(m<d)
  {
    cout<<"Cannot reach";
  }
  else
  {
    cout<<"Can reach";
  }
}