import javax.swing.*;
 
class Program extends JFrame
{
	JTable tabla;
	JScrollPane spanel;
	Program()
	{
		String[] mezoNevek = {"id", "Nev", "Telepules", "Kor"};
		Object[][] adat = {
			{1, "Nagy Peter", "Szolnok", 67},
			{2, "Nagy Lajos", "Szolnok", 27}
			};
 
		tabla = new JTable(adat, mezoNevek);
		spanel = new JScrollPane(tabla);		
		spanel.setBounds(0, 0, 400, 500);	
 
		add(spanel);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 500);
		setVisible(true);
	}
	public static void main(String[] argv)
	{
		new Program();
	}
}