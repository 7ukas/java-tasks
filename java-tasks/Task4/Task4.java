public class Task4 {
    public static void matrixOperations() {
        int[][] matrix = new int[3][3];
        int[] sums = new int[matrix.length];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = new Random().nextInt(1,10);
                sums[i] += matrix[i][j];
                sb.append(matrix[i][j] + " ");
            }
            sb.append("\n");
        }

        System.out.println("Masyvas: \n" + sb.toString());

        for (int i = 0; i < sums.length; i++) {
            System.out.println("Eilutes " + (i+1) + " suma: " + sums[i]);
        }
    }
}

