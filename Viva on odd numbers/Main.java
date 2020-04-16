#include<iostream>
using namespace std;
int main()
{
  int n;
  float c=0;
  char ch;
  int d=3;
  //Type your code here.
  while(d)
  {
    cin>>n;
    
    if(n<0)
    {
      c-=1;
      break;
    }
    if(n%2==1)
    {
      c+=1;
      d--;
    }
    if(n%2==0)
    {
      c-=.5;
    }
   
  }
  cout<<c;
}