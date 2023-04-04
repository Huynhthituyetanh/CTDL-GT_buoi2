//https://codehow.net/de-quy-nhi-phan-binary-recursion-trong-c-c++-89.html//
#include <iostream>
using namespace std;
  
int fib(int n){
  if(n <= 2) return 1;
  return fib(n - 1) + fib(n - 2);
}
  
int main() {
  int kq,n;
  cout<<"Nhập vị trí n muốn tìm trong dãy fibonacci: ";
  cin>>n;
  kq = fib(n);
  cout<<"\nSố fibonacci ở vị trí "<<n<<" là: "<<kq;
  cout<<"\n-----------------------------------\n";
  cout<<"Chương trình này được đăng tại codehow.net";
}
