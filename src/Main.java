import java.util.Arrays;

public class Main {
    public static int playersCount = 10;

    public static void main(String[] args) {
        int[] a = new int[]{45, 31, 24, 22, 20, 17, 14, 13, 12, 10};
        int[] b = new int[]{31, 18, 15, 12, 10, 8, 6, 4, 2, 1};
        int[] c = new int[]{51, 30, 10, 9, 8, 7, 6, 5, 2, 1};

        System.out.println("\uD83C\uDFC6 В НАЦИОНАЛЬНУЮ СБОРНУЮ ПОПАДАЮТ НОМЕРА \uD83C\uDFC6");
        System.out.println(Arrays.toString(nationalTeam(a, b, c)));

    }

    public static int[] merge(int[] x, int[] y) {
        int[] z = new int[playersCount];
        int ix = 0;
        int iy = 0;
        int iResult = 0;
        while (iResult < x.length) {
            if (ix == x.length) {
                z[iResult] = y[iy];
                iy++;
                iResult++;
            } else if (iy == y.length) {
                z[iResult] = x[ix];
                ix++;
                iResult++;
            } else {
                if (x[ix] >= y[iy]) {
                    z[iResult] = x[ix];
                    ix++;
                } else {
                    z[iResult] = y[iy];
                    iy++;
                }
                iResult++;
            }
        }
        return z;
    }

    public static int[] nationalTeam(int[] a, int[] b, int[] c){
        int[] result;
        result = merge(a, b);
        result = merge(result, c);
        return result;
    }
}
