package flyweight;

public class TreeManager {
    int[][] treesCoordinate = new int[][]{
            new int[]{1, 2},
            new int[]{2, 3},
            new int[]{3, 4},
            new int[]{5, 6},
    };


    public void displayTree(){
        Tree tree = new Tree();
        for (int[] xy : treesCoordinate) {
            tree.setX(xy[0]);
            tree.setY(xy[1]);
            tree.display();
        }
    }
}
