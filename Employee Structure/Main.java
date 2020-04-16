#include<iostream>
#include<string.h>
using namespace std;
struct emp
{
  string name;
  int id;
  int age;
  string designation;
  int salary;
};
int main()
{
  //Type your code here.
  struct emp a;
  cout<<"Enter name:";
  getline(cin,a.name);
  cout<<"\nEnter ID:";
  cin>>a.id;
  cout<<"\nEnter age:";
  cin>>a.age;
  cout<<"\nEnter designation:";
  cin>>a.designation;
  cout<<"\nEnter Salary:";
  cin>>a.salary;
  cout<<"\nEmployee Details";
  cout<<"\nName of the Employee : "<<a.name;
  cout<<"\nID of the Employee : "<<a.id;
  cout<<"\nAge of the Employee : "<<a.age;
  cout<<"\nDesignation of the Employee : "<<a.designation;
  cout<<"\nSalary of the Employee : "<<a.salary;
}