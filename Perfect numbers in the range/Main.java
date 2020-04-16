#include<iostream>
int main()
{
  int a,b;
  std::cin>>a>>b;
  int c;
  for(int i=a;i<b;i++)
  {
    c=0;
    for(int j=1;j<i;j++)
    {
      if(i%j==0)
        c+=j;
    }
    //std::cout<<c<<" "<<a<<"\n";
    if(c==i)
      std::cout<<i<<" ";
  }
}