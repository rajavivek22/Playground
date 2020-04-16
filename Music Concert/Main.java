#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  // Type your code here
  int n;
  cin>>n;
  int *p;
  p=(int*)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    cin>>*(p+i);
  }
  int c=0;
  for(int i=0;i<n;i++)
  {
    if(*(p+i)%2!=0)
      c++;
  }
  cout<<c<<"\n"<<n-c;
  return 0;
}