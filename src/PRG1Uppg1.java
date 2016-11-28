import javax.swing.*;

/**
 * Created by beni15 on 2016-11-28.
 */
public class PRG1Uppg1 {
    public static void main (String[] args) {
        String s =JOptionPane.showInputDialog("Antal rader?");
        int n =Integer.parseInt(s);
        String txt ="";
            for(int i=1; i<=n; i++) {
                for(int j=1; j<=i; j++) {
                    System.out.print(i * j + " ");
                }
            System.out.print("\n");
        }
    }
}
