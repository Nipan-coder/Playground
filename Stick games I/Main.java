#include<iostream>
using namespace std;
int main()
{
  int n,m,res;
  std::cin>>n>>m;
  if(n<m)
    res = n;
  else
    res = m;
  if(res % 2 == 0)
    std::cout <<"Mani Iyer";
  else
    std::cout <<"Arun Gupta";
  return 0;
}
