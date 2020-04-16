#include<iostream>
int main()
{
  int a,b,c,d;
  std::cin>>a>>b>>c>>d;
  if(a%d==0 && b%d==0 && c%d==0)
    std::cout<<"Answer is correct.";
  else
    std::cout<<"Answer is wrong.";
}