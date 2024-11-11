public class Task9 {
    public static void findMaxInMatrix() {
        int[][] matrix = new int[4][4];
        int max = Integer.MIN_VALUE;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = new Random().nextInt(1,20);
                if (matrix[i][j] > max) max = matrix[i][j];
                sb.append(matrix[i][j] + "\t");
            }
            sb.append("\n");
        }

        System.out.println("Masyvas: \n" + sb.toString());
        System.out.println("Didziausia reiksme: " + max);
    }
}

