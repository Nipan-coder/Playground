#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,n1,s,t=1;
  cin>>n>>n1;
  s=n1;
  while(s<n)
  {
    cin>>n1;
    s+=n1;
    t++;
  }
  cout<<"The number of turns is "<<t;
  return 0;
}

