package lee;
import java.util.*;
public class Name{
	static String y ="*";
	static String za=" ";
	static int val=0;
	static int num=4;
	static String s1="";
	public void methType() {
		System.out.println("1. Emoji");
		System.out.println("2. Nick Name");
		System.out.println("3. Heart Symbol");
		System.out.println("4. Default");
		System.out.println("Enter The Selected Value");
		Scanner s1=new Scanner(System.in);
		val=s1.nextInt();
		if(val==3) {
	        y = "\u2665";
	        za=" ";
	        methMaa();
	        methType();
		}
		if(val==2) {
			System.out.println("Enter Your Nick Name less than 5 characters to get proper result");
			s1.nextLine();
			y=s1.nextLine();
			for(int i=1;i<y.length();i++) {
				za=za+" ";
			}
			methMaa();
			za=" ";
			methType();
		}
		if(val==1) {
			y="\u263A";
			za=" ";
			methMaa();
			methType();
			
		}
		if(val==4) {
			y="*";
			za=" ";
			methMaa();
			za=" ";
			methType();
		}
		if(val==5) {
			System.out.println("Thanks for using this program!");
		}
		s1.close();
	}
	static void methMaa() {
		for(int i=0;i<=num;i++) {
			for(int l=0;l<s1.length();l++) {
				char c=s1.charAt(l);
				switch(c) {
				case ' ' :System.out.print("     ");
				break;
				case '.' :System.out.print(". ");
				break;
				case 'A' :methA(num,i);			
				break;
				case 'B' :methB(num,i);			
				break;
				case 'C' :methC(num,i);
				break;
				case 'D' :methD(num,i);
				break;
				case 'E' :methE(num,i);
				break;
				case 'F' :methF(num,i);
				break;
				case 'G' :methG(num,i);
				break;
				case 'H' :methH(num,i);
				break;
				case 'I' :methI(num,i);
				break;
				case 'J' :methJ(num,i);
				break;
				case 'K' :methK(num,i);
				break;
				case 'L' :methL(num,i);
				break;
				case 'M' :methM(num,i);
				break;
				case 'N' :methN(num,i);
				break;
				case 'O' :methO(num,i);
				break;
				case 'P' :methP(num,i);
				break;
				case 'Q' :methQ(num,i);
				break;
				case 'R' :methR(num,i);
				break;
				case 'S' :methS(num,i);
				break;
				case 'T' :methT(num,i);
				break;
				case 'U' :methU(num,i);
				break;
				case 'V' :methV(num,i);
				break;
				case 'W' :methW(num,i);
				break;
				case 'X' :methX(num,i);
				break;
				case 'Y' :methY(num,i);
				break;
				case 'Z' :methZ(num,i);
				break;
				default:System.out.print("You Entered Wrongly");
				break;
				}
			}
			System.out.println("");
			
		}
	}

	static void methA(int n,int i){
			for(int j=0;j<=n;j++) {
				if((i==0 && (j>0 && j<n))||(j==0&&(i>0))||i==n/2||(j==n && i>0)) {
					System.out.print(y);
				}
				else {
					System.out.print(za);
				}	
			}
			System.out.print("   ");
	}
	static void methB(int n,int i){
				for(int j=0;j<=n;j++) {
				if((i==0 && (j<n))||(j==0)||(i==n/2 && j !=n)||(j==n&&(i>0 && i<n && i!=n/2))||(i==n&&j<n)) {
					System.out.print(y);
				}
				else {
					System.out.print(za);
				}	
			}
			System.out.print("   ");
	}

	static void methC(int n,int i){
			for(int j=0;j<=n;j++) {
				if(i==0||j==0||i==n) {
					System.out.print(y);
				}
				else {
					System.out.print(za);
				}	
			}
			System.out.print("   ");
	}
	static void methD(int n,int i){
		
			for(int j=0;j<=n;j++) {
				if((i==0 && j <n)||j==0||(i==n && j!=n)||(j==n && i != 0 && i!=n)) {
					System.out.print(y);
				}
				else {
					System.out.print(za);
				}	
			}
			System.out.print("   ");
	}
	static void methE(int n,int i){
			for(int j=0;j<=n;j++) {
				if(i==0||j==0||i==n||i==n/2) {
					System.out.print(y);
				}
				else {
					System.out.print(za);
				}	
			}
			System.out.print("   ");
	}
	static void methF(int n,int i){
			for(int j=0;j<=n;j++) {
				if(i==0||j==0||i==n/2) {
					System.out.print(y);
				}
				else {
					System.out.print(za);
				}	
			}
			System.out.print("   ");
	}
	static void methG(int n,int i){
			for(int j=0;j<=n;j++) {
				if(((j<=n/2)&&(j==0 || i==n ||i==0))||(j>=n/2 &&i>=n/2 &&(j==n/2 ||i==n/2 ||j==n ))){
					System.out.print(y);
				}
				else {
					System.out.print(za);
				}	
			}
			System.out.print("   ");
	}
	static void methH(int n,int i) {
				for(int j=0;j<=n;j++) {
				if(i==n/2 || j==0 || j==n){
					System.out.print(y);
				}
				else {
					System.out.print(za);
				}	
			}
			System.out.print("   ");
	}	
	static void methI(int n,int i) {
				for(int j=0;j<=n;j++) {
				if(j==n/2 || i==0 || i==n){
					System.out.print(y);
				}
				else {
					System.out.print(za);
				}	
			}
			System.out.print("   ");
	}
	static void methJ(int n,int i) {
			for(int j=0;j<=n;j++) {
				if((j==n/2 || i==0)||(j<=n/2 && i>=n/2 &&(i==n||j==0))){
					System.out.print(y);
				}
				else {
					System.out.print(za);
				}	
			}
			System.out.print("   ");
	}
	static void methK(int n,int i){
				for(int j=0;j<=n;j++) {
				if(j==0||j+i==3 || i-j==1){
					System.out.print(y);
				}
				else {
					System.out.print(za);
				}	
			}
			System.out.print("  ");
	}
	static void methL(int n,int i) {
				for(int j=0;j<=n;j++) {
				if(j==0 ||i==n ){
					System.out.print(y);
				}
				else {
					System.out.print(za);
				}	
			}
			System.out.print("   ");
	}
	static void methM(int n,int i) {
			for(int j=0;j<=n;j++) {
				if(j==0 || j==n ||(i<=n/2 &&(i+j == n || i-j ==0))){
				System.out.print(y);				
					}
				else {
					System.out.print(za);
				}	
				}
				System.out.print("   ");
			}
	static void methN(int n,int i) {
				for(int j=0;j<=n;j++) {
					if(j==0 || j==n || i-j==0){
					System.out.print(y);				
					}
					else {
						System.out.print(za);
					}	
				}
				System.out.print("   ");
			}

	static void methO(int n,int i) {
			for(int j=0;j<=n;j++) {
				if((j==0 && (i>0&&i<n))||(j==n && (i>0&&i<n))||(i==0 &&(j>0&&j<n) )||(i==n && (j>0&&j<n))){
					System.out.print(y);
				}
				else {
					System.out.print(za);
				}	
			}
			System.out.print("   ");
	}
	static void methP(int n,int i) {
				for(int j=0;j<=n;j++) {
					if((j==0)||(i==0 && j<=n/2)||(i==n/2 && j<=n/2)||(j==n/2 && i<=n/2)){
						System.out.print(y);
					}
					else {
						System.out.print(za);
					}	
				}
				System.out.print(" ");
		}
	static void methQ(int n,int i) {
					for(int j=0;j<=n;j++) {
					if(((i != n && j!= n) &&(i==0 || i== n-1 || j==0 || j==n-1 ))|| (i>=n/2 && i-j == 0 )){
					System.out.print(y);				
					}
					else {
						System.out.print(za);
					}	
				}
				System.out.print("   ");
			}
	static void methR(int n,int i) {
					for(int j=0;j<=n;j++) {
					if((i==0&&j<n) || j==0	||(i==n/2 && j !=n) ||((i>=n/2)&&i-j==0)||(j==n && i<n/2 &&i>0)){
					System.out.print(y);				
					}
					else {
						System.out.print(za);
					}	
				}
				System.out.print("   ");
			}
	static void methS(int n,int i) {
				for(int j=0;j<=n;j++) {
					if((i==0 ||i==n || (j==0 && i<=n/2) ||i==n/2) ||(j==n && i>=n/2)){
					System.out.print(y);				
					}
					else {
						System.out.print(za);
					}	
				}
				System.out.print("   ");
			}
	static void methT(int n,int i) {
				for(int j=0;j<=n;j++) {
					if(i==0 ||j==n/2){
					System.out.print(y);				
					}
					else {
						System.out.print(za);
					}	
				}
				System.out.print("   ");
			}
	static void methU(int n,int i) {
				for(int j=0;j<=n;j++) {
					if((j==0 && i<n)||(j==n && i<n) ||( i==n && j<n && j>0)){
					System.out.print(y);				
					}
					else {
						System.out.print(za);
					}	
				}
				System.out.print("   ");
			}
	static void methV(int n,int i) {
				for(int j=0;j<=n;j++) {
					if((i>(n)/2) && ((i-j==n/2)||(i+j == n+2))||(i<n/2 && (j==0||j==n) )||(i==n/2&&(j==0 || j== n))){
					System.out.print(y);				
					}
					else {
						System.out.print(za);
					}	
				}
				System.out.print("   ");
			}
	static void methW(int n,int i) {
			for(int j=0;j<=n;j++) {
				if(j==0 || j==n ||(i>=n/2 && i-j==0)||(i==n-1 && j != n/2)){
				System.out.print(y);				
				}
				else {
					System.out.print(za);
				}	
			}
			System.out.print("   ");
		}
	static void methX(int n,int i) {
				for(int j=0;j<=n;j++) {
					if(i+j==n || i-j==0){
					System.out.print(y);				
					}
					else {
						System.out.print(za);
					}	
				}
				System.out.print("   ");
			}
	static void methY(int n,int i) {
				for(int j=0;j<=n;j++) {
					if(i+j==n ||(i<=n/2 && i-j==0)){
					System.out.print(y);				
					}
					else {
						System.out.print(za);
					}	
				}
				System.out.print("  ");
		}
	static void methZ(int n,int i) {
		 		for(int j=0;j<=n;j++) {
					if(i==0 || i==n ||i+j==n){
					System.out.print(y);				
					}
					else {
						System.out.print(za);
					}	
				}
				System.out.print("   ");
			}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		s1=scan.nextLine();
		s1=s1.trim();
		s1=s1.toUpperCase();
		Name lee=new Name();
		lee.methType();
	
	scan.close();
		
	}	
}

