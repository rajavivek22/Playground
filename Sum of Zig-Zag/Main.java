#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i,j,n,m;
  cin>>n>>m;
  int a[n][m];
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      cin>>a[i][j];
    }
  }
  int sum=0;
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      if(i==0 && i!=j)
        sum+=a[i][j];
      if(i==j)
        sum+=a[i][j];
      if(i==n-1 && i!=j)
        sum+=a[i][j];
    }
  }
  cout<<"Sum of Zig-Zag pattern is "<<sum;
      
}