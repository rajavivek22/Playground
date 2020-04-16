#include<iostream>
int main()
{
  int max;
  int fl;
  std::cin>>max>>fl;
  if(max==fl)
  {
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  }
  else if(max>fl)
  {
    std::cout<<"Yes, you can enter.";
  }
  else
  {
    std::cout<<"Sorry, you can't enter";
  }
}