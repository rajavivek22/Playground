#include<iostream>
using namespace std;
int power(int m,int n)
{
  int p=1;
  for(int i=1;i<=n;i++)
  {
    p*=m;
  }
  return p;
}
int main()
{
  int m;
  int n;
  int p=1;
  int r;
  cin>>m>>n>>r;
  p=power(m,n);
  if(p>=r)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}