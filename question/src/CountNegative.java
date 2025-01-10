public class CountNegative {
    public static void main(String[] args) {
    int [][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
//    int [][] grid = {{3,2},{1,0}};
    int ans=countNegatives(grid);
    int ans1=countNegativesBS(grid);
        System.out.println(ans1);

    }
    static int countNegativesBS(int[][] grid) {
        int count=0;
        int rows=grid.length;
        int row=0;
        int col=grid[0].length-1;
// Starting from the last index of first row
        while(row<rows && col>=0){
// if element is grater then 0 so other left hand side elements are positive so skip the row
            if(grid[row][col] >= 0){
                row++;
            }else{
// if we found negative number so decrement the col and increment the count
                count+=rows-row;
                col--;
            }
        }
        return count;
    }


    static int countNegatives(int[][] grid) {
        int count=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] < 0){
                    count++;
                }
            }
        }
        return count;
    }
}
