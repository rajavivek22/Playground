#include<iostream>
int main(){
  // Type your code here
  int fact=1;
  int n;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    fact*=i;
  }
  std::cout<<fact;
}