#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int b=-2;
  int d=2;
  int temp=0;
  int i;
  while(n>0)
  {
    for(i=0;i<2;i++)
    {
      b+=d;
      cout<<b<<" ";
     
      n--;
       if(n==0)
        break;
    }
    d+=4;
  }
}