#include<iostream>
using namespace std;
void find(int *p,int n)
{
  int o=0;
  int e=0;
  for(int i=0;i<n;i++)
  {
    if(*(p+i)%2==0)
      e++;
    else
      o++;
  }
  if(e!=0 && o!=0)
    cout<<"The array is Mixed";
  else if(e==0)
    cout<<"The array is Odd";
  else
    cout<<"The array is Even";
}
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int *p=(int*)malloc(n*sizeof(int));
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
  {
    cin>>*(p+i);
  }
  find(p,n);
  return 0;
}