public class arrayClass{
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(int i=0;i<cars.length;i++){
            System.out.print(cars[i] +" ");
        }

        System.out.print("\n");

        int[] myNum = {10, 20, 30, 40};
        for(int i=0;i<myNum.length;i++){
            System.out.print(myNum[i]+" ");
        }
        
        System.out.print("\n");

        String[] car = {"Volvo", "BMW", "Ford", "Mazda"};
            for (String i : car) {
            System.out.println(i);
            }
            System.out.print("\n");

            //Multidimensional Arrays
            int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
            System.out.println(myNumbers[1][2]); // Outputs 7

            for(int i=0;i<4;i++){
                for(int j=0;j<3;j++){
                    System.out.println(i+" "+j);
                }
                System.out.println("\n");
            }
    }
}