#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char str1[50], str2[50];
  gets(str1);
  gets(str2);
  if(strcmp(str1, str2)==0)
    std::cout<<"It is correct";
  else
    std::cout<<"It is wrong";
  return 0;
}

