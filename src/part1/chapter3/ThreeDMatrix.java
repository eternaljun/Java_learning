package part1.chapter3;

// Продемонстрировать применение трёхмерного массива
public class ThreeDMatrix {
    public static void main(String[] args) {
        int threeD[][][] = new int[3][4][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int l = 0; l < 5; l++) {
                    threeD[i][j][l] = i * j * l;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int l = 0; l < 5; l++) {
                    System.out.print(threeD[i][j][l] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
