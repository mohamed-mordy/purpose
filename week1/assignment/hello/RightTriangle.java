/* *****************************************************************************
 *  Name:              Mohamed M. A. Mordy
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int med = a + b + c - max - min;

        boolean con1 = a > 0 && b > 0 && c > 0;
        boolean con2 = max * max == min * min + med * med;
        boolean isRightTriangle = con1 && con2;
        System.out.println(isRightTriangle);
    }
}
