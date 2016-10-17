#include<iostream>
using namespace std;

int myAlgorithm1(int n) {
	int x = n+10;
	x = x/2;
	return x;
}

int main() {
	int n;
	cout << "Input the value of n: :";
	cin >> n;
	myAlgorithm1(n);
}
