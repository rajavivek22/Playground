#include<iostream>
int main()
{
  int a=6;
  int n;
  std::cin>>n;
  int temp=5;
  int d=1;
  while(n--)
  {
    std::cout<<a<<" ";
    a+=temp*d;
    d++;
  }
}
  