//time1
import java.util.*;


public class T {

   static class Time{
    int h,m,s;
    Time(int a,int b,int c){
        if(a>=0 && a<24 && b>=0 && b<60 && c>=0 && c<60){
            h=a;
            m=b;
            s=c;
            System.out.println("Date assigned");
        }
        else{
            System.out.println("Enter proper date");
        }
    }

    public void con_into_sec(){
        System.out.println("current time is "+h+":"+m+":"+s);
        System.out.println("seconds since midnight 00:00:00 is "+((h*3600)+(m*60)+(s)));
    }
}

    public static void main(String [] arg){
        
        Time a = new Time(23,45,57);
        a.con_into_sec();
        Time b = new Time(00,10,6);
        b.con_into_sec();
        Time c = new Time(24,0,23);
        
        
    }
}

