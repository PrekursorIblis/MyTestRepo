import java.util.Scanner;
public class Test  {
    public static Scanner in =new Scanner(System.in);
    public static int[] tab;
    public static void main(String[] arg){
            System.out.println("Podaj zakres danych");
            int rozmiar = in.nextInt(); 
            System.out.println("Podaj elementy tablicy");
            tab= new int[rozmiar];
            for (int i = 0; i < rozmiar; i++) {
                tab[i]=in.nextInt();          
            }
            
            for (int i = 0; i < rozmiar; i++) {
               System.out.print( tab[rozmiar-(i+1)]+" ");          
            }
            
    }
}
