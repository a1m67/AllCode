#include<bits/stdc++.h>
using namespace std;
int main(){
	int m,n;
	cin>>m>>n;
	int b[101][101];
	char a[101][101];
	for (int i = 0; i < m; ++i)
	{
		for (int j = 0; j < n; ++j){
				b[i][j]=0;
			}	
	}
	for (int i = 0; i < m; ++i)
	{
		for (int j = 0; j < n; ++j){
				cin>>a[i][j];
				if (a[i][j]=='*')
				{

					b[i][j-1]++;
					b[i-1][j]++;
					b[i][j+1]++;
					b[i+1][j]++;
					b[i-1][j-1]++;
					b[i-1][j+1]++;
					b[i+1][j-1]++;
					b[i+1][j+1]++;
				}
			}	 
	}
	for (int i = 0; i < m; ++i)
	{
		for(int j=0;j<n;++j)
		{
			if(a[i][j]=='*')
				cout<<"*";
			else
				cout<<b[i][j];
		}
		cout<<endl;

	}
	return 0;
}