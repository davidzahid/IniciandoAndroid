package mx.zahid.iniciandroandroid;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		View vista = findViewById(R.id.titulo);
		TextView texto = (TextView) vista;

		for(double i=0;  i<1; i=i+0.01){
			/*una tabla del seno*/
			double senodex =  Math.sin(i);
			texto.append("\n Seno"+"("+i+")= "+senodex);
			
		}
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		
	
		
		
	}

}
