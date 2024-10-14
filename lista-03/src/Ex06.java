public class Ex06 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    matriz[i][j] = 1; 
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        
        System.out.println("Matriz 5x5 com Diagonal Principal:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%2d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
