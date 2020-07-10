#include<iostream>
using namespace std;
struct employee
{
  char name[50];
  int id;
  int age;
  char designation[50];
  int salary;
};
int main() 
{
  employee e;
  std::cout<<"Enter name:"<<endl;
  std::cin>>e.name;
  std::cout<<"Enter ID:"<<endl;
  std::cin>>e.id;
  std::cout<<"Enter age:"<<endl;
  std::cin>>e.age;
  std::cout<<"Enter designation:"<<endl;
  std::cin>>e.designation;
  std::cout<<"Enter Salary:"<<endl;
  std::cin>>e.salary;
  std::cout<<"Employee Details"<<endl;
  std::cout<<"Name of the Employee : "<<e.name<<endl;
  std::cout<<"ID of the Employee : "<<e.id<<endl;
  std::cout<<"Age of the Employee : "<<e.age<<endl;
  std::cout<<"Designation of the Employee : "<<e.designation<<endl;
  std::cout<<"Salary of the Employee : "<<e.salary;
  return 0;
}