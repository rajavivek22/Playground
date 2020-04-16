#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int c=0;
  
  for(int i=1;i<=n;i++)
  {
    if(n%i==0)
      c++;
  }
  if(c==2)
    std::cout<<"Eligible";
  else
    std::cout<<"Not eligible";
  return 0;
}