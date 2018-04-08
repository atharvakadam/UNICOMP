import java.io.FileNotFoundException;
//import java.util.Arrays;
import java.util.Scanner;
public class universities
{
    static int i;
    static String uni1,uni2;
    public static void main(String [] args) throws FileNotFoundException
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter name of university 1: ");
        uni1= s.next();
        System.out.println("Enter the name of the university 2: ");
        uni2 =s.next();
        java.io.File file1 = new java.io.File("Uni.txt");
        Scanner sc = new Scanner(file1);
        for(i=1;i<31;i++)
        {
            String name=sc.nextLine();
            //name = name.trim();
            String [] n =name.split(",");
            //String n1 =Arrays.toString(n);
            //System.out.println(n1);
            if (n[0].equals(uni1) )
            {
                System.out.println("School name: " + n[0]+ " ");
                System.out.println("CS ranking is: " +n[1]+ " ");
                System.out.println("National ranking is: " + n[2]+ " ");
                System.out.println("Acceptance rate is: " + n[3]+ " ");
                System.out.println("Tuition fees is: " + n[4]+ " ");
                System.out.println("Location: " + n[5]+ " ");
                System.out.println("School type: " + n[6]+ " ") ;
                System.out.println();
            }

            else if(n[0].equals(uni2))
            {
                System.out.println("School name: "+ n[0]+ " ");
                System.out.println("CS ranking : " +n[1]+ " ");
                System.out.println("National ranking : " + n[2]+ " ");
                System.out.println("Acceptance rate : " + n[3]+ " ");
                System.out.println("Tuition fees : " + n[4]+ " ");
                System.out.println("Location: " + n[5]+ " ");
                System.out.println("School type: " + n[6]+ " ") ;
                System.out.println();


            }
        }


    }
}