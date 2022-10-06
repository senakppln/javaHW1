
package proje2udemy;


public class Proje2Udemy {

    public static void main(String[] args) {
       
        char harf= 'e';
        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");
           
        int number= 28;
        int total= 0;
        
        for (int i = 1; i < number; i++) {
            if(number % i==0){
                total= total + i;
            }
        }
        if(number == total){
            System.out.println("Mükemmel sayıdır");
        }
        else{
            System.out.println("Mükemmel sayı değildir");
        }
        }
        
        int number1 = 220;
        int number2= 284;
        int total1 =0;
        int total2 =0;
        for (int i = 1; i < number1; i++) {
            if(number1 % i==0){
                total1 = total1 +i;
            }
        }
        for (int i = 1; i < number2; i++) {
            if (number2 % i ==0) {
                total2 = total2 +i;
            }
        }
        
        if (total1== number2 && total2==number1) {
            System.out.println("Kardeş Sayıdırlar" );
        }
        else{
            System.out.println("Kardeş sayı değildirler");
        }       

        int[] sayilar= new int[]{1,2,5,7,9,0};
        int aranacak= 13;
        boolean varMi = false;
        
        for (int sayı : sayilar) {
            if (sayı==aranacak) {
                varMi = true;
                break;
            }
        }
        
        if (varMi) {
            System.out.println("sayı var");
        }
        else{
            System.out.println("Sayı yok");
        }
    }
    
}
