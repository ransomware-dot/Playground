#include<iostream>
using namespace std;
int count(int ); 
int main()
{
    int n,sum=0;
	cin>>n;
    while(n>0)
    {
        sum=sum+n%10;        
    n=n/10;               
    if(n==0)           
        {
         n=sum;
         sum=0;            //intialize to zero for performing another addtion
         if(count(n)==1)   //when count(n) is 1 exits from the loop
         {
             break;
         }
        }
    }
   cout<<n;
}
int count(int x)              
{
    int i=0;
    while(x>0)
    {
        x=x/10;
        i++;
    }
    return i;
}