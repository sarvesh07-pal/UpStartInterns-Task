import java.util.*;

class Task1 {

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }

    public static double calculateAverage(int[] arr) {
        int sum = calculateSum(arr);
        return (double) sum/arr.length;
    }

    public static int largestNumber(int[] arr) {
        int largest = arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;    
    }

    public static int smallestNumber(int[] arr) {
        int smallest = arr[0];
        for(int i=1; i<arr.length;i++) {
            if(arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");

        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Please enter a positive integer.");
            } else {
                int[] arr = new int[n];
                System.out.println("Enter " + n + " numbers:");
                for (int i = 0; i < n; i++) {
                    
                    if ( sc.hasNextInt()) {
                        arr[i] = sc.nextInt();
                    } else {
                        System.out.println("Invalid input. Please enter integers only.");
                        sc.close();
                        return;
                    }

            } 

            int sum = calculateSum(arr);
            double average = calculateAverage(arr);
            int largest = largestNumber(arr);
            int smallest = smallestNumber(arr);


            System.out.println("-------Results-------");
            System.out.printf("%-20s %10d\n", "Sum:", sum);
            System.out.printf("%-20s %10.2f\n", "Average:", average);
            System.out.printf("%-20s %10d\n", "Largest Number:", largest);
            System.out.printf("%-20s %10d\n", "Smallest Number:", smallest);

            sortArray(arr);

            System.out.println("\nSorted Array: ");
            System.out.println(Arrays.toString(arr));
        }
       
    } else {
            System.out.println("Invalid input. Please enter a positive integer.");
        }
        sc.close();
    }
}
