#include<iostream>
int main()
{
  int a,b;
  std::cin>>a>>b;
  int n=a+b;
  int c=0;
  for(int i=1;i<n;i++)
  {
    if(n%i==0)
      c+=i;
  }
  if(c==n)
    std::cout<<"They can read the message";
    else
      std::cout<<"They can't read the message";
}