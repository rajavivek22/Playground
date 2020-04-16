#include <iostream>
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   //Your code goes here
   struct student s;
  std::cin.getline(s.name,50);
  std::cin>>s.roll>>s.marks;
  std::cout<<"\nStudent Details\nName: "<<s.name<<"\nRoll: "<<s.roll<<"\nMarks: "<<s.marks;
  
}