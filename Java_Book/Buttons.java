import javax.swing.* ;  //Example code demonstrating making Buttons

class Buttons extends JFrame //Subclass of JFrame
{
	JPanel pnl = new JPanel() ;
	
	ClassLoader ldr = this.getClass().getClassLoader(); //Classloader object

	java.net.URL tickURL = ldr.getResource("tick.png"); //URL of images
	java.net.URL crossURL = ldr.getResource("cross.png");
	
	ImageIcon tick = new ImageIcon( tickURL ); //Calls images
	ImageIcon cross = new ImageIcon( crossURL );	
	
	JButton btn = new JButton ( "Click Me" ) ;
	JButton tickBtn = new JButton ( tick) ;
	JButton crossBtn = new JButton ( "STOP", cross ) ;
	
	public Buttons ()
	{
		super( "Swing Buttons") ; //Specifies the Buttons
		setSize( 500, 200 ) ;
		setDefaultCloseOperation( EXIT_ON_CLOSE ) ;
		add ( pnl ) ;
		setVisible ( true ) ;
		pnl.add( btn );
		pnl.add( tickBtn );
		pnl.add( crossBtn );
	}
	
	public static void main( String[] args ) 
	{
		Buttons gui = new Buttons () ;
	}
}
 