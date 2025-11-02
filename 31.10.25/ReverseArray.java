class ReverseArray 
{
    public static void main(String[] args) 
	{
        // Given values
        int[] arr = {1, 2, 3, 4, 5, 6};

        // Print the array in reverse order
        System.out.println("Output :");
        for (int i = arr.length - 1; i >= 0; i--) 
		{
            System.out.println("The " + i + " index value of  array is  : " + arr[i]);
        }
    }
}
