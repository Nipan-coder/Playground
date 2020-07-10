#include <cstring>
#include <iostream>
int main()
{
  int count=0;
  char str[100];
  std::cin.getline(str,100);
  //std::cout<<str;
  int len=strlen(str);
  for(int i=0;i<len;i++)
  {
    if(str[i]==' ')
    {
      count++;
    }
  }
  if(count<=10)
  {
    std::cout<<"Caption eligible for the contest";
  }
  else
  {
    std::cout<<"Caption not eligible for the contest";
  }
  return 0;
}
