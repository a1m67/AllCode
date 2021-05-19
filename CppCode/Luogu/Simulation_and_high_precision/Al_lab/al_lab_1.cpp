#include <bits/stdc++.h>
using namespace std;

// void quickSort(int a[],int low,int high){
// 	if(high<=low)return;
// 	int i = low-1,h=high+1;
// 	int key = a[low];
// 	while(i<h){
// 		do i++; while(a[i]<key);
// 		do h--; while(a[h]>key);
// 		if(i<h)swap(a[i],a[h]);
// 	}
// 	quickSort(a,low,h);
// 	quickSort(a,h+1,high);
// }

// void q_sort(int *a, int l, int r) {

// 	if (l >= r) return;

// 	int i = l - 1, j = r + 1;
// 	int x = a[(l + r) >> 1];
// 	while (i < j) {
// 		do i++; while (a[i] < x);
// 		do j--; while (a[j] > x);
// 		if (i < j) swap(a[i], a[j]);
// 	}
// 	q_sort(a, l, j);
// 	q_sort(a, j + 1, r);
// }
// 
// 
// 



void quickSort(int a[],int low,int high){
	int l = low,h=high;
	int key = a[(low+high)>>1];
	if (low>=h)
	{
		return;
	}
	while(true){
	if(l>=h)break;
	while(a[l]<key)l++;
	while(a[h]>key)h--;
	if(l<h)	swap(a[l],a[h]);
	}
	quickSort(a,low,h);
	quickSort(a,h+1,high);
}
int main(){

		int n;
		cin>>n;
		int a[n];
		for (int i = 0; i < n; ++i)
		{
			cin>>a[i];
		}
		for (int i = 0; i < n; ++i)
		{
			cout<<a[i];
		}
		cout<<"\n";
		quickSort(a, 0, n);
		for (int i = 0; i < n; ++i)
		{
			cout<<a[i]<<" ";
		}
		return 0;
}

