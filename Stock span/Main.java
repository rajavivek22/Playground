#include<iostream>
using namespace std;
int main()
{
  int n, sum=0;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++) {
    std::cin>>a[i];}
  std::cout<<"1"<<"\n";
  for(int i=0;i<(n-1);i++) {
    if(a[i]>a[i+1]) 
      std::cout<<"1"<<"\n";
    else
    { sum=sum+2;
     std::cout<<sum<<"\n";}
  }
    
}