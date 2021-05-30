#include <bits/stdc++.h>
using namespace std;
int main(){
	int a[100001];
	string s[100001];
	int n,m;
	cin>>n>>m;
	int x=0,t;

	int j = 0;
	for (int i = 0; i < n; ++i)
	{
		cin>>a[i]>>s[i];
	}
	for (int i = 0; i < m; ++i)
	{
		cin>>x>>t;
		if (x==a[j])
		{
			j+=n-t;
			j=j%n;
		}
		else{
			j+=t;
			j=j%n;
		}
	}
	cout<<s[j];
	return 0;
}