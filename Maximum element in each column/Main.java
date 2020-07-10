
#include<iostream>
using namespace std;
void largestInColumn(int mat[20][20], int rows, int cols)
{
  for (int i = 0; i < cols; i++)
  {
    int maxm = mat[0][i];
    for (int j = 1; j < rows; j++)
    {
      if (mat[j][i] > maxm) 
                maxm = mat[j][i];
    }
    cout << maxm << endl;
  } 
}
int main()
{
  int n, m;
  std::cin>>n>>m;
  int a[20][20];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<m;j++)
    {
      std::cin>>a[i][j];
    }
  }
  largestInColumn(a, n, m);
  return 0;
}
