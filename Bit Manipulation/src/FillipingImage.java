public class FillipingImage {

    // https://leetcode.com/problems/flipping-an-image/description/

    public static void main(String[] args){
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
//        System.out.println(flipAndInvertImage(image));
        int[][] printimage = flipAndInvertImage(image);
        for(int[] row : printimage) {
            for(int i=0; i<row.length;i++){
                System.out.print(row[i] +" ");
            }
            System.out.println();
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                int tmp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = tmp;
            }
        }
        return image;
    }
}
