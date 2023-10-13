import java.util.Scanner;

public class ShortestPath {
    public static void main(String[] args) {
        String strg = "SWNEW";
        int x = 0, y = 0;

        for (int i = 0; i < strg.length(); i++) {
            char dir = strg.charAt(i);
            if (dir == 'E') {
                x++;
            } else if (dir == 'W')
             {
                x--;
            } else if (dir == 'N') 
            {
                y++;
            } else
             {
                y--;
            }

        }
        int X1 = x * x;
        int Y2 = y * y;
        float sortestpath = (float) Math.sqrt(X1 + Y2);
        System.out.println(sortestpath);
    }
}
