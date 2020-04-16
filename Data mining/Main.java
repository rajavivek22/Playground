#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int o=0;
  int e=0;
  int n;
  cin>>n;
  int temp;
  while(n)
  {
    temp=n%10;
    if(temp%2==0)
      e+=temp;
    else
      o+=temp;
    n=n/10;
  }
  if(o==e)
    cout<<"Yes";
  else
    cout<<"No";
}