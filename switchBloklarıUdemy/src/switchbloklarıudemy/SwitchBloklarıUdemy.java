
package switchbloklarıudemy;

public class SwitchBloklarıUdemy {

    public static void main(String[] args) {
        char grade ='B';
        
        switch(grade){
            case 'A' -> System.out.println("Mükemmel geçtiniz:)");
            case 'B' -> System.out.println("İyi Geçtiniz");
            case 'C' -> System.out.println("Geçtiniz");
            case 'D' -> System.out.println("zor geçtiniz.");
            case 'F' -> System.out.println("Kaldınız.");
            default -> System.out.println("Geçersiz not girdiniz.");
                
        }
    }
    
}
