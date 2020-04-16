#include<iostream>
int main()
{
  float a=0.5;
  int n;
  std::cin>>n;
  while(n--)
  {
    std::cout<<a<<" ";
    a*=3;
  }
}