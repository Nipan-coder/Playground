#include<iostream>
using namespace std;
int main()
{
  int row,col;
  cin>>row;
  cin>>col;
  int arr[row][col];
  for(int i=0;i<row;i++)
  {
    for(int j=0;j<col;j++)
    {
      cin>>arr[i][j];
    }
  }
  int r[row];
  int rowtotal;
  int rowindex=0;
  for(int i=0;i<row;i++)
  {
    rowtotal=0;
    for(int j=0;j<col;j++)
    {
      rowtotal=rowtotal+arr[i][j];
    }
    r[rowindex]=rowtotal;
    rowindex++;
  }
  cout<<"Sum of rows is";
  for(int i=0;i<rowindex;i++)
  {
    cout<<" "<<r[i];
  }
  int max;
  int tempindex=0;
  max=r[0];
  for(int i=0;i<rowindex;i++)
  {
    if(max<r[i])
    {
      max=r[i];
      tempindex=i;
    }
  }
  cout<<"\nRow "<<(tempindex+1)<<" has maximum sum\n";
  int c[col];
  int coltotal;
  int colindex=0;
  for(int i=0;i<col;i++)
  {
    coltotal=0;
    for(int j=0;j<row;j++)
    {
      coltotal=coltotal+arr[j][i];
    }
    c[colindex]=coltotal;
    colindex++;
  }
  cout<<"Sum of columns is";
  for(int i=0;i<rowindex;i++)
  {
    cout<<" "<<c[i];
  }
  int cmax;
  int tempcindex=0;
  cmax=c[0];
  for(int i=0;i<colindex;i++)
  {
    if(cmax<c[i])
    {
      cmax=c[i];
      tempcindex=i;
    }
  }
  cout<<"\nColumn "<<(tempcindex+1)<<" has maximum sum";
  return 0;
}

