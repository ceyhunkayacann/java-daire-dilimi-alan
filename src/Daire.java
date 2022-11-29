import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        //Formül : (𝜋 * (r*r) * 𝛼) / 360

        int r;
        int a;
        double PI = 3.14;
        double result;

        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçapı giriniz : ");
        r = input.nextInt();
        System.out.print("Merkez açı ölçüsü giriniz : ");
        a = input.nextInt();

        result = (PI * (r * r) * a) / 360;

        System.out.println("Alan : " + result);


    }
}
