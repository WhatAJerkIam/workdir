package yj.mine;

import java.util.Arrays;

public class Test {

    public int[] sortArrayByParity(int[] A) {
//        Arrays.sort(A , (a,b) -> {
//        return (int) (a % 2) - (int)(b % 2);
//    } );


        return A;
    }

    public static void main(String[] args) {
    int[] A = {3,1,2,4};
        Test t = new Test();
        System.out.println(Arrays.toString(t.sortArrayByParity(A)));
    }
    class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;

        public Node() {}

        public Node(boolean _val,boolean _isLeaf,Node _topLeft,Node _topRight,Node _bottomLeft,Node _bottomRight) {
            val = _val;
            isLeaf = _isLeaf;
            topLeft = _topLeft;
            topRight = _topRight;
            bottomLeft = _bottomLeft;
            bottomRight = _bottomRight;
        }
    };

    public Node construct(int[][] grid , int sx , int sy , int ex , int ey) {

        Node n = new Node();
        n.isLeaf = true;
        int val = grid[sx][sy];

        for(int i = sx ; i <= ex  ;i++)
            for(int j = sy ; j <= ey && n.isLeaf ; j++ ){
                if(val != grid[i][j]){
                    n.isLeaf = false;
                }
            }

        n.val = val == 1;
        return n;

    }
}
