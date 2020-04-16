#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int a=11;
  while(n--)
  {
    std::cout<<a*a<<" ";
    a+=4;
  }
}