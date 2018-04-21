package assignment;

import java.util.Scanner;

public class debugging1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
while(a!=0){
	int b=s.nextInt();
	int c=s.nextInt();
	int d=s.nextInt();
	int count=0;
	int sum=0;
	while(sum!=d){
		if(sum+c<d){
			sum+=c;
			count++;
		}else if(sum+b<d){
			sum+=b;
			count++;
		}else if(sum+b<d){
			sum+=b;
			count++;
		}
	}
	
	
	a--;
}
	}

}
