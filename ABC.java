import java.util.Scanner;
public class ABC {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      String[] nom={"arsene","baltimore","claire","dom","ephaistos","ferran","garp","hermes","iron","jon","kall","lamine","map","naruto","oppote","patrick","q","ren","seiko","takakura","ulquira","vald","waly","xen","yelena","zed"};
        System.out.println("entrer");
      String m=input.next();
      for (String l:nom){
          if (m.toLowerCase().equals(l.substring(0,1))){
              System.out.println(l);
              if (m.toLowerCase().equals("a")){
                  System.out.print("le BG");


              }
          }
      }
    }
}
