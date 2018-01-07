import javax.swing.* ;  //Example code demonstrating making a window

class Window extends JFrame //Subclass of JFrame
{
	JPanel pnl = new JPanel() ;
	
	public Window ()
	{
		super( "Swing Window") ; //Specifies the window
		setSize( 500, 200 ) ;
		setDefaultCloseOperation( EXIT_ON_CLOSE ) ;
		add ( pnl ) ;
		setVisible ( true ) ;
	}
	
	public static void main( String[] args ) 
	{
		Window gui = new Window () ;
	}
}
 