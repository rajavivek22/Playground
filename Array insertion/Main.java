#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int *a=(int*)malloc(n*sizeof(int));
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
  {
    cin>>*(a+i);
  }
  cout<<"Enter the location where you wish to insert an element\n";
  int b;
  cin>>b;
  if(b>n+1)
  {
    cout<<"Invalid Input";
    goto aa;
  }
  int y;
  cout<<"Enter the value to insert\n";
  cin>>y;
  cout<<"Array after insertion is\n";
  a=(int*)realloc(a,sizeof(int)*(n+1));
  for(int i=n;i>=b;i--)
  {
    *(a+i)=*(a+i-1);
  }
  *(a+b-1)=y;
  for(int i=0;i<n+1;i++)
  {
    cout<<*(a+i)<<"\n";
  }
  aa:
  return 0;
}