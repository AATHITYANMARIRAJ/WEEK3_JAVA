import java.util.*;
public class rect{
 static class Rectangle{
	Scanner sc=new Scanner(System.in);
	float length,width;
	Rectangle(){
		length=1;
		width=1;
	}
	void setlength(float val){
		do{
			length=val;
			if(length<=0 || length>20){
				System.out.print("Enter length between the ranges(0.0 to 20.0): ");
				val=sc.nextFloat();
			}
			
		}while(val<=0 || val>20);
		length=val;
	}
	void setwidth(float val){
		do{
			width=val;
			if(width<=0 || width>20){
				System.out.print("Enter width between the ranges(0.0 to 20.0): ");
				val=sc.nextFloat();
			}
		}while(val<=0 || val>20);
		width=val;
	}
	float getlength(){
		return length;
	}
	float getwidth(){
		return width;
	}
}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Rectangle obj1=new Rectangle();
		
		System.out.print("Enter the length: ");
		obj1.setlength(sc.nextInt());
		
		System.out.print("Enter the width: ");
		obj1.setwidth(sc.nextInt());
		
		float perimeter=2*(obj1.getlength()+obj1.getwidth());
		float area=obj1.getlength()*obj1.getwidth();
		
		System.out.printf("Perimeter: %.2f\nArea: %.2f",perimeter,area);
	}
}
