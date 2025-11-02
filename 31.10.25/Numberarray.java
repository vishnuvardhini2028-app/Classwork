import java.util.Scanner;
class Numberarray 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
        int length = sc.nextInt();
		int[] arr = new int[length];
        // Input values
        for (int i = 0; i < length; i++) 
		{
            System.out.println("Enter the " + i + " index value");
            arr[i] = sc.nextInt();
        }

        // Output values
        for (int i = 0; i < length; i++)
		{
            System.out.println("The " + i + " index value of array is  : " + arr[i]);
        }
    }
}
