#include<iostream>
using namespace std;
void doc(int m,int n,int req)
{
  if(m*n*req<=50)
  {
    cout<<"Doctor, you can proceed with your experiment.";
  }
  else
  {
    cout<<"Sorry Doctor! You need more bacteria.";
  }
}
int main()
{
  int m,n,req;
  cin>>m>>n>>req;
  doc(m,n,req);
  return 0;
}
