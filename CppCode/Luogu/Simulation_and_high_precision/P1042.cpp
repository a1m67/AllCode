#include <bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
	char s[62505];
	char a;
	int i=0;
	int wCnt =0;
	int lCnt =0;
	while(cin>>a){
		if(a=='E')break;
		s[i++]=a;
	}
	int n=--i;
	for (int i = 0; i <=n; ++i)
	{
		if (s[i]=='W')
		{
			wCnt++;
		}
		else if (s[i]=='L')
		{
			lCnt++;
			/* code */
		}
		if((wCnt==11&&wCnt-lCnt>=2)||(lCnt==11&&lCnt-wCnt>=2))
		{
			printf("%d:%d\n",wCnt,lCnt);
				wCnt=0;lCnt=0;
		}
		else if((wCnt>=11&&wCnt-lCnt>=2)||((lCnt>=11&&lCnt-wCnt>=2)))
		{
			printf("%d:%d\n",wCnt,lCnt);
				wCnt=0;lCnt=0;
		}
	}
	printf("%d:%d\n\n",wCnt,lCnt);
	wCnt=0;lCnt=0;
	for (int i = 0; i <= n; ++i)
	{
		if (s[i]=='W')
		{
			wCnt++;
		}
		else if (s[i]=='L')
		{
			lCnt++;
		}
		if((wCnt==21&&wCnt-lCnt>=2)||(lCnt==21&&lCnt-wCnt>=2))
		{
			printf("%d:%d\n",wCnt,lCnt);
				wCnt=0;lCnt=0;
		}
		else if((wCnt>=21&&wCnt-lCnt>=2)||((lCnt>=21&&lCnt-wCnt>=2)))
		{
			printf("%d:%d\n",wCnt,lCnt);
				wCnt=0;lCnt=0;
		}
	}
	printf("%d:%d\n",wCnt,lCnt);
	return 0;
}