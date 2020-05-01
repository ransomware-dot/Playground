#include <cstring>
#include <iostream>
#include <cstdlib>
#define ll long long
using namespace std;

ll fibo_recur(int n)
{
    if (n == 1 || n == 2)
        return 1;
    else
        return fibo_recur(n - 1) + fibo_recur(n - 2);
}

int main()
{
    int n;
        cin>>n;
        cout<<"The term "<<n<<" in the fibonacci series is "<<fibo_recur(n-1)<<endl;
    
    return 0;
}