import java.util.Scanner;
public class ArrayRotation {
    public static int[] rotation(int [] Array,int Rotation)
    {

        while (Rotation>0)
        {
            int last=Array[Array.length-1];
            for (int i = Array.length - 1; i > 0; i--) {
                Array[i] = Array[i - 1];
            }
            Array[0] = last;
            Rotation--;
        }
        return Array;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size : ");
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();
        int[] Array=new int[size];
        System.out.println("Enter the Elements : ");
        for(int i=0;i<size;i++)
        {
            Array[i]=scan.nextInt();
        }
        System.out.println("Enter the Number of Rotation : ");
        int Rotation=scan.nextInt();
        int[] Output = rotation(Array,Rotation);
        for(int i=0;i<Output.length;i++)
        {
            System.out.println(Output[i]+" ");
        }
    }
}
