public class Zero{
  public static void main(String[] args){
     int[][] sales=new int[3][5];
     int zeroCounter=1;
     
     for(int row=0;row<sales.length;row++){
       for(int col=0;col<sales[row].length;col++){
           sales[row][col]=0;
           System.out.println("Zeroing element at row"+row+",col"+col+", Order:" + zeroCounter);
           zeroCounter++;
       }
     }
     
     for(int row=0;row<sales.length;row++){
       for(int col=0;col<sales[row].length;col++){
           System.out.println(sales[row][col]+" ");
       }
     }
  }
  
}
