public class p22 {
    
        public static void main(String[] args) {
            int N = 3; // You can change this value to generate a pattern for different values of N
            int size = 2 * N - 1; // The size of the pattern matrix
    
            // Generate the pattern
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    // Calculate the distance from the edges
                    int top = i;
                    int bottom = size - i - 1;
                    int left = j;
                    int right = size - j - 1;
    
                    // Find the minimum distance manually
                    int minDistance = top;
                    if (bottom < minDistance) minDistance = bottom;
                    if (left < minDistance) minDistance = left;
                    if (right < minDistance) minDistance = right;
    
                    // Calculate the value to print
                    int value = N - minDistance;
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }
    }
    

