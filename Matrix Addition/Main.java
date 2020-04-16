#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m;
  cin>>n>>m;
  int **p=(int**)malloc(n*sizeof(int));
  int **q=(int**)malloc(n*sizeof(int));
  int **add=(int**)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    *(p+i)=(int*)malloc(m*sizeof(int));
  }
  for(int i=0;i<n;i++)
  {
    *(q+i)=(int*)malloc(m*sizeof(int));
  }
  for(int i=0;i<n;i++)
  {
    *(add+i)=(int*)malloc(m*sizeof(int));
  }
  
  for(int i=0;i<n;i++)
    for(int j=0;j<m;j++)
      cin>>*(*(p+i)+j);
  for(int i=0;i<n;i++)
    for(int j=0;j<m;j++)
      cin>>*(*(q+i)+j);
  for(int i=0;i<n;i++)
    for(int j=0;j<m;j++)
      *(*(add+i)+j)=*(*(p+i)+j)+*(*(q+i)+j);
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<m;j++)
    {
      cout<<*(*(add+i)+j)<<" ";
    }
    cout<<"\n";
  }
  
}