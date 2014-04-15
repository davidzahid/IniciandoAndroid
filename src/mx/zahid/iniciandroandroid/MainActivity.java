package mx.zahid.iniciandroandroid;


import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView texto = (TextView) findViewById(R.id.titulo);
		texto.setText("Texto desde "+"Java");
		texto.setTextColor(Color.argb(255, 255, 255, 0));
		
		//**Añadiendo texto adicional con addView**//
		//******************************************
		TextView textV =new TextView(this);
		textV.setTextColor(Color.argb(255, 255, 0, 255));
		textV.setTextSize(40);
		textV.setText("\n Añadiendo nuevo texto con addView");
		//******************************************
		RelativeLayout ll = (RelativeLayout) findViewById(R.id.relativeLayouttest);
		
		//***enviamos texto a relative layout***//
		ll.addView(textV);
		//*************************************//
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		
	
		
		
	}

}
