#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m;
  cin>>n>>m;
  int a[n+1][m+1];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<m;j++)
    {
      cin>>a[i][j];
    }
  }
  for(int i=0;i<n;i++)
  {
    int sum=0;
    for(int j=0;j<m;j++)
    {
      sum+=a[i][j];
    }
    a[i][m]=sum;
  }
  cout<<"Sum of rows is";
  int max=a[0][m];
  int d=0;
  for(int i=0;i<n;i++)
  {
    cout<<" "<<a[i][m];
    if(a[i][m]>max)
    {
      d=i;
      max=a[d][m];
    }
  }
  cout<<"\nRow "<<d+1<<" has maximum sum";
  cout<<"\nSum of columns is";
  max=0;
  for(int j=0;j<m;j++)
  {
    int sum=0;
    for(int i=0;i<n;i++)
    {
      sum+=a[i][j];
    }
    a[n][j]=sum;
  }
  max=a[n][0];
  d=0;
  for(int j=0;j<m;j++)
  {
    if(max<a[n][j])
    { d=j;
    max=a[n][j];}
    cout<<" "<<a[n][j];
  }
  cout<<"\nColumn "<<d+1<<" has maximum sum";
}