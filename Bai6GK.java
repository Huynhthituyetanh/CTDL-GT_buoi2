#include <iostream>
using namespace std;
void Quick_Sort(int a[], int left, int right){
	int i, j, x;
	x = a[(left+right)/2];
	i = left; j = right;
	do{
		while(a[i] < x) i++;
		while(a[j] > x) j--;
		if(i <= j){
			swap(a[i],a[j]);
			i++; j--;
		}
	}while(i <= j);
	if(left<j){
		Quick_Sort(a, left, j);
	}
	if(i<right){
		Quick_Sort(a, i, right);
	}
}

void main()
{
	int a[6] = {8, 4, 1, 6, 5};
	Quick_Sort(a, 0, 5);
	cout<<"Mang sau khi sap xep:"<<endl;
	for(int i=0;i<6;i++){
		cout<<a[i]<<" ";
	}
	system("pause");
}
Footer
© 2023 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About

