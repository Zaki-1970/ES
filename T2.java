/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manager;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author mustafamhemeed
 */
public class T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        
        Scanner input = new Scanner (file);
        
        while (input.hasNext()) {
		String code = input.next();
	        String Violation = input.next();
		double fine= input.nextDouble();
		boolean paid = input.nextBoolean();
			System.out.println("code" + code + ",Violation" + Violation + ",fine" + fine + ",paid"+ paid);
		}

		// Close the file
		input.close();
    
}
}