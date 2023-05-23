/*

* Author: Jakabos Ábel
* Copyright: 2023, Jakabos Ábel
* Group: Szoft/1/n
* Date: 2021-09-03

* Licenc: GNU GPL
*/

import javax.swing.*;

 
class Program extends JFrame
{
	JTable tabla;
	JScrollPane spanel;
    JButton gomb;
	Program()
	{
		String[] mezoNevek = { "Nev", "Telepules", "szul","fizetes"};
		Object[][] adat = {
			{1, "Nagy Peter", "Szolnok", 67},
			{2, "Nagy Lajos", "Szolnok", 27}
			};
            
        gomb = new JButton("lapoz");
		tabla = new JTable(adat, mezoNevek);
		spanel = new JScrollPane(tabla);
		

		spanel.setBounds(0, 0, 400, 300);	
        
            
        
		add(spanel);
        add(gomb);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
		setSize(400, 500);
		setVisible(true);
	}
	public static void main(String[] argv)
	{
        
		
	}
}