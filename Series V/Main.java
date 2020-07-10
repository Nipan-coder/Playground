#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num,start=11,print;
  cin>>num;
  for(int i=1;i<=num;i++)
  {
    print=start*start;
    start=start+4;
    cout<<print<<" ";
  }
  return 0;
}

