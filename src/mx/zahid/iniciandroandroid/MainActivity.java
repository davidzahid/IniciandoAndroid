package mx.zahid.iniciandroandroid;


import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.widget.TextView;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView texto = (TextView) findViewById(R.id.titulo);
		texto.setText("Texto desde "+"Java");
		texto.setTextColor(Color.argb(255, 255, 255, 0));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		
	
		
		
	}

}
