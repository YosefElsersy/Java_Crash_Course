public class Recursion {
public static void main(String[] args) {
    int result = mul(5);
    System.out.println(result);
}
public static int mul(int k)
{
    if (k>0) {
        return k * mul(k-1);
    }else{
        return 1;
    }
}
// public static int sum(int k)
// {
//     if (k>0) {
//         return k + sum(k-1);
//     }else{
//         return 0;
//     }
// }
}
