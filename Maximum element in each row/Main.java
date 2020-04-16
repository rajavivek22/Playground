#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m;
  cin>>n>>m;
  int a[n][m];
  int i,j;
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      cin>>a[i][j];
    }
  }
  int max;
  for(i=0;i<n;i++)
  {
    max=a[i][0];
    for(j=0;j<m;j++)
    {
      if(a[i][j]>max)
        max=a[i][j];
    }
    cout<<max<<"\n";
  }
  
}