#include<iostream>
using namespace std;
int main()
{
int n,Diag1=0,Diag2=0,i,j;
  cin>>n;
  int Matrix[n][n];
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      cin>>Matrix[i][j];
    }
  }
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      if(i==j)
      {
        Diag1+=Matrix[i][j];
      }
      if(i+j+1==n)
      {
        Diag2+=Matrix[i][j];
      }
    }
  }
  if(Diag1==Diag2)
    cout<<"Yes";
  else
    cout<<"No";
  return 0;
}

