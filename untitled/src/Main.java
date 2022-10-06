import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        char grade= 'C';

        switch(grade) {
            case 'A':
                System.out.println("Mükemmel geçtiniz");
            break;
            case 'B':
                System.out.println("Güzel geçtiniz");
                break;
            case 'C':
                System.out.println("İyi geçtiniz");
                break;
            case 'D':
                System.out.println("Geçtiniz");
                break;
            case 'F':
                System.out.println("Kaldınız");
                break;
            default:
                System.out.println("Lütfen geçerli sayı giriniz");
                break;






        }


    }
}