// The complexity of this program is n^2

#include<iostream>
using namespace std;

int myAlgorithm3(int n) {
	int sum = 0;

	for(int i=1; i<=n; i++) {
		for(int j=i; j<=n; j++) {
			sum += (i+j);
		}
	}

	return sum;
}

int main() {
	int n = 0;

	cout << "\n\n Input n: ";
	cin >> n;
	cout << "\n" << myAlgorithm3(n) << "\n\n";

	return 0;
}
