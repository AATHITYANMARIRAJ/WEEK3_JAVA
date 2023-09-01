import java.util.*;


public class T1 {

static class Time2{
    int h,m,s;
    Time2(int a,int b,int c){
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
    public void display(){
        System.out.println("current time is "+h+":"+m+":"+s);
    }

    public void con_into_sec(){
        System.out.println("current time is "+h+":"+m+":"+s);
        System.out.println("seconds since midnight 00:00:00 is "+((h*3600)+(m*60)+(s)));
    }

    public void tick(){
        if (s==59){
            if (m==59){
                if (h==23){
                    h=0;
                    m=0;
                    s=0;
                }
                else{
                    h+=1;
                    m=0;
                    s=0;
                }
            }
            else{
                m+=1;
                s=0;
            }
        }
        else{
            s+=1;
        }
        System.out.println("1 second added");
    }

    void inc_min(){
        if (m==59){
            if (h==23){
                h=0;
                m=0;
            }
            else{
                h+=1;
                m=0;
            }
        }
        else{
            m+=1;
        }
    
    System.out.println("1 minute added");
    }

    void inc_hour(){
        if (h==23){
            h=0;
        }
        else{
            h+=1;
        }
        System.out.println("1 hour added");
    }
}
    public static void main(String [] arg){
        
        Time2 a = new Time2(23,45,57);
        a.display();
        a.inc_hour();
        a.display();
        Time2 b = new Time2(00,59,6);
        b.display();
        b.inc_min();
        b.display();
        Time2 c= new Time2(15,35,59);
        c.display();
        c.tick();;
        c.display();
        
    }
}


