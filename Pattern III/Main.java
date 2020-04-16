#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int c=1;
  int i,j;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      if(j!=1)
        cout<<"*";
      cout<<c;
    }
    cout<<"\n";
    c++;
  }
  c--;
  for(i=n;i>=1;i--)
  {
    for(j=i;j>=1;j--)
    {
      if(j!=i)
        cout<<"*";
      cout<<c;
    }
    cout<<"\n";
    c--;
  }
}