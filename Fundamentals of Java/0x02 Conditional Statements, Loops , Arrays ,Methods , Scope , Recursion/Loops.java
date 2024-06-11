public class Loops {
    public static void main(String[] args) {
     int i =0 , n = 10;
    //  while (i < 5) {
    //     System.out.println(i);
    //     i++;
    //  }
     do {
        System.out.println(i);
        i++;
     } while (i <= 5);   

    System.out.println("===============");

     while (n < 10) {
        if (n == 4) {
            continue;
        }
         System.out.println(n);
         i++;
        //  if (n == 4) {
        //      break;
        //     }
     }
    
    for(int j = 0; j <5 ; j++){
        if (i == 4) {
            break;
        }
        System.out.println(j);
    }
    for(int x = 0; x <10 ; x+=2){
        if (i == 6) {
            continue;
        }
        System.out.println(x);
    }

    String[] cars = {"Volvo","BMW","Ford","Mazda"};

    for (String c : cars) {
        System.out.println(c);
    }

    
    }
}
