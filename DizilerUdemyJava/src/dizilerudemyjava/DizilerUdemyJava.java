
package dizilerudemyjava;


public class DizilerUdemyJava {

    public static void main(String[] args) {
        String ogrenci1= "Engin";
        String ogrenci2="Derin";
        String ogrenci3="Sena";
        
        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        
        System.out.println("--------------------");
        
        
        
        
        String[] ogrenciler = new String[5];
        ogrenciler[0]= "engin";
        ogrenciler[1]="Derin";
        ogrenciler[2]="Sena";
        ogrenciler[3]="Sibel";
        ogrenciler[4]="Semih";
        
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
            
        }
        System.out.println("--------");
        for (String ogrenci:ogrenciler) {
            System.out.println(ogrenci);
        }
        
                
    }
    
}
