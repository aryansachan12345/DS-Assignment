import java.util.ArrayList;
import java.util.Scanner;
public class GfG {
    public static ArrayList<ArrayList<Integer>>
                            transpose(int[][] mat) {
        int rows = mat.length;           
        int cols = mat[0].length;        

        ArrayList<ArrayList<Integer>> tMat = new ArrayList<>();

        for (int i = 0; i < cols; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < rows; j++) {
                
                row.add(mat[j][i]);  
            }
            tMat.add(row);
        }

        return tMat;
    }
    public static void main(String[] args) {

        int[][] mat = {
            {1, 1, 1, 1},
            {2, 2, 2, 2},
            {3, 3, 3, 3},
            {4, 4, 4, 4}
        };

        ArrayList<ArrayList<Integer>> res = transpose(mat);

        for (ArrayList<Integer> row : res) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}