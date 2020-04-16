#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,e,f,g;
  cin>>a>>b>>c>>d>>e>>f>>g;
  int sum=a*100+a*100*0.5;
  sum+=b*100;
  sum+=c*100;
  sum+=d*100;
  sum+=e*100;
  sum+=f*100;
  sum+=g*100+g*100*0.25;
  if(a>8)
  {
    sum+=(a-8)*15;
  }
  if(b>8)
  {
    sum+=(b-8)*15;
  }
  if(c>8)
  {
    sum+=(c-8)*15;
  }
  if(d>8)
  {
    sum+=(d-8)*15;
  }
  if(e>8)
  {
    sum+=(e-8)*15;
  }
  if(f>8)
  {
    sum+=(f-8)*15;
  }
  if(g>8)
  {
    sum+=(g-8)*15;
  }
   cout<<sum;
}