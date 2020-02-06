public class Sumavg {
public static void main(String[] args) {   
 
       int[] num = new int[]{20, 30, 25, 35, -16, 60, 90};
       int sum = 0;
       for(int i=0; i < num.length ; i++)
{
        sum = sum + num[i];
}
        float average = (float) sum / num.length;
        System.out.println("Average value of the array elements is : " + average); 
   }
}