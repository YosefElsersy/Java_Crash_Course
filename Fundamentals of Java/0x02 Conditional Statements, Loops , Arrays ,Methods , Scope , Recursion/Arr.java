public class Arr {
    public static void main(String[] args) {
        String[] cars ={"volvo","BMW","Ford","Mazd"}; // One-Dimensional Array


        cars[0] = "Opel";
        System.out.println(cars[0]);

        // for (String c : cars) {
        //     System.out.println(c);
        // }

        // for (int i = 0; i < cars.length; i++) {
        //     System.out.println(cars[i]);
        // }
        // myNumbers[1][2] = 9;
        // System.out.println(myNumbers[1][2]);
        int [][] myNumbers = {{1,2,3,4},{5,6,7}};
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
