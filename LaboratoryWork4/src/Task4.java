import java.util.Arrays;

public class Task4 {
    public Task4() {
      
    }

    public void Init() {
        int[] arr = {1, -2, 3, 4, -5, 6, 7, 8, 9, 10};
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {  // check if the element is odd
                arr[i] *= -1;  // change the sign of the odd element
            }
        }
        
        System.out.println("Modified Array: " + Arrays.toString(arr));
    }
}
