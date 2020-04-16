#include <iostream>
int main() 
{
	// Type your code here
  int n;
  std::cin>>n;
  int rev=0;
  while(n)
  {
    rev=rev*10+n%10;
    n/=10;
  }
  std::cout<<rev;
	return 0;
}