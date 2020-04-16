#include<iostream>
#include<cstdlib>
using namespace std;
void queue(int n, int m, int *a)
{
  int rem=0;
  int c=0;
  for(int i=0;i<n;i++)
  {
    rem+=m-*(a+i);
    c++;
    if(rem>m)
    {
      c--;
      rem-=m;
    }
  }
  cout<<c;
}
int main()
{
  //Type your code here.
  int n,m;
  cin>>n>>m;
  int *a=(int*)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    cin>>*(a+i);
  }
  queue(n,m,a);
  return 0;
}