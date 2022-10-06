
package javaapplication4;

public class JavaApplication4 {

    public static void main(String[] args) {
        char grade ='B';
        
        switch(grade){
            case 'A':
                System.out.println("Mükemmel geçtiniz:)");
                break;
            case 'B':
                System.out.println("İyi Geçtiniz");
                break;
            case 'C':
                System.out.println("Geçtiniz");
                break;
            case 'D':
                System.out.println("zor geçtiniz.");
                break;
            case 'F':
                System.out.println("Kaldınız.");
                break;
            default:
                System.out.println("Geçersiz not girdiniz.");
                
        }
    }
    
}
