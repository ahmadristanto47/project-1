import java.util.Scanner;

import javax.swing.JOptionPane;

public class Array2 {

    public static void main(String[] args) {
        
    	String rupiahInput , dollarInput;
    	double rupiah , dollar;
    	rupiahInput = JOptionPane.showInputDialog("masukan nilai ke rupiah : ");
    	rupiah = double.parseDouble(rupiahInput);
    	dollarInput = JOptionPane.showInputDialog("masukan nilai ke dollar : ");
    	dollar = double.parseDouble(dollarInput);
    	
    	rupiah = rupiah/14000;
    	dollar = dollar*14000;
    	
    	JOptionPane.showMessageDialog(null,"hasil konfersi ke dollar $:"+rupiah+"\n"+""+"hasil konfersi dollar ke rupiah rp:" +dollar);
    	
    }
    
}