


//Real Life Problem Tackling Program.

//IDEA:-TO Prepare a railway ticket
//charging the bill as:- 1Rs/km till 100km
//Above 100km,till 500km charge 1.5Rs/km.
//Above 500km charge 2Rs/km
//If  the person is senior citizen or a child below 10 yrs then 50 percent discount is provided on the bill.
//Also allot Lower berth to senior citizen. To other ,any random berth can be alloted.


#include<cstdlib>
#include <iostream>
using namespace std;
class real{  
  public:
    string name;
    double bill;
    int age;
    double distance;
    int rem;
    double calc_bill(double distance){//For calculating the initial bill without any discount
        if(distance>=0 && distance<=100){
            bill=distance*1.0;
            return bill;
        }else if(distance>100 && distance<=500){
         rem=distance-100;
            bill=(100*1.0)+(rem*1.5);
            return bill;
        }else{
            rem=distance-500;
            bill=(100*1.0)+(400*1.5)+rem*2.0;
            return bill;
        }
    }
    double discount(int age,double b){//For senior citizen and child discount.
        double nb=b;
        if(age>=60||age<=10){
           b=b-(b*0.5);
        return b;
        }else{return nb;}
    }string stats(int a2){//For segregating child,tennager,adult andnsenior citizen.
        string stat="";
        if(a2>=60){stat="senior citizen";return stat;}
        else if(a2<=10){stat="child";return stat;}
        else if(a2>10&&a2<=17){stat="teenager";return stat;}
        else{stat="adult";return stat;}
    }
    string berth(string str){//Providing lower berth to senior citizen and random to others.
        string str2="";
        if(str=="senior citizen"){
            str2="Lower berth";return str2;
        }else{int ran=rand();
        if(ran%2==0){str2="Lower berth";return str2;}
        else if(ran%3==0){str2="Upper berth";return str2;}
        else{str2="Middle berth";return str2;}
        }
    }
};
int main(){//for taking input and displaying the ticket.
	real obj;
    double d;
    string s="";
    string status="";
    string birth;
    int a;
    string gen;
    double ini_bill;
double dis_bill;
    cout<<"enter the distance :"<<endl;
    cin>>d;	
    ini_bill=obj.calc_bill(d);
    cout<<"enter the age :"<<endl;
    cin>>a;
    dis_bill=obj.discount(a,ini_bill);
    cout<<"enter your name :";
    cin>>s;
    cout<<"enter your gender :";
    cin>>gen;
    status=obj.stats(a);
    birth=obj.berth(status);
    int seat=rand();
cout<<"----------------------Railway Ticket-------------------------------"<<endl;
  cout<<"Name\tAge\tBill\tDiscounted_Bill\tGender\tStatus\tSeat\tBerth"<<endl;
  
  cout << s <<"\t"<< a << "\t"<< ini_bill <<"\t"<< dis_bill << "\t"<<gen<<"\t"<< status << "\t"<< seat <<"\t"<< birth <<endl;
  
  cout<<"-----------------------Happy Journey-------------------------------"<<endl;
	return 0; 
}