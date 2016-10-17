// The complexity of this program is n

#include<iostream>
using namespace std;

int myAlgorithm2(int n) {
	int sum = 0;

	for(int i=1; i<=n; i++) {
		sum += i;
		if(sum>=1000) break;
	}

	return sum;
}

int main() {
	int n;
	cout << "\n\nEnter the value of n: ";
	cin >> n;
	
	cout << "\n" << myAlgorithm2(n) << "\n\n";

	return 0;
}
