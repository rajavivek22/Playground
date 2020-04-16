#include<iostream>
using namespace std;
struct time
{
  int h,m,s;
};
int main()
{
  //Type your code here.
  struct time t1,t2;
  cin>>t1.h>>t1.m>>t1.s>>t2.h>>t2.m>>t2.s;
  t1.h-=t2.h;
  t1.m-=t2.m;
  t1.s-=t2.s;
  while(t1.s>=60)
  {
    t1.s-=60;
    t1.m+=1;
  }
  while(t1.m>=60)
  {
    t1.m-=60;
    t1.h+=1;
  }
  if(t1.s<0)
  {
    t1.s+=60;
    t1.m-=1;
  }
  if(t1.m<0)
  {
    t1.m+=60;
    t1.h-=1;
  }
  cout<<t1.h<<":"<<t1.m<<":"<<t1.s;
}