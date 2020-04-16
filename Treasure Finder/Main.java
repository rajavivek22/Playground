#include<iostream>
using namespace std;
int LCM(int a, int b,int c)
{
  int min=a;
  if(b<min)
  {
    min=b;
  }
  if(c<min)
  {
    min=c;
  }
  int i;
  for(i=min;i>0;i--)
  {
    if(a%i==0 && b%i==0 && c%i==0)
    {
      break;
    }
  }
  return i;
}
int main()
{
  //Type your code here.
  int a,b,c;
  cin>>a>>b>>c;
  int min;
  if((a>b && a<c)|| (a>c &&a<b))
    min=a;
  if((b>a && b<c) || (b>c && b<a))
    min=b;
  if((c>a && c<b) || (c>b && c<a))
    min=c;
    
      cout<<"The treasure is in box which has number "<<min;
   
  cout<<"\nThe code to open the box is "<<LCM(a,b,c);
}