#include<iostream>
using namespace std;
int main()
{
  char c[50];
  gets(c);
  int count=0;
  while(c[count]!='\0')
    count++;
  for(int i=0;i<count;i++)
  {
    while((c[i]>='a' && c[i]<='z')||(c[i]>='A' && c[i] <= 'Z'))
    {
      std::cout<<c[i];
      c[i]='\0';
    }
  }
  return 0;
}

