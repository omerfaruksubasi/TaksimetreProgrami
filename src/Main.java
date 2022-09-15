import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    double gidilenYol,tutar;
        Scanner input = new Scanner(System.in);
        System.out.print("gidiceginiz KM yi yaziniz: ");
        gidilenYol = input.nextDouble();
        tutar = gidilenYol*2.20;
        System.out.println("tutar: " + (tutar<20?tutar=20:tutar));
    }
}
