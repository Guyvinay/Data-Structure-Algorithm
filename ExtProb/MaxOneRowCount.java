package ExtProb;

public class MaxOneRowCount {
    public static void main(String[] args) {
        int[][] mat = {
            {0, 0, 1, 0},
            {0, 1, 1, 1},
            {1, 1, 1, 1},
            {0, 0, 0, 0}
    };
        System.out.println(maxOneRowCount(mat));
    }
    public static int maxOneRowCount(int[][] mat){
        int maxOne = 0;
        int maxOneInd = -1;
        for(int i=0; i<mat.length; i++){
            int m = 0;
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j]==1)m++;
            }
            if(m>maxOne){
                maxOne=m;
                maxOneInd = i;
            }
            // System.out.println(m);
        }
        return maxOneInd;
    }
}
