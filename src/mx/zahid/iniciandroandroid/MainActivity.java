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
		/*Definicion con View*/
		View vista = findViewById(R.id.titulo);
		TextView texto = (TextView) vista;
		texto.setText("Texto 1 Definido con setText");
		/*Añadir texto con append*/
		texto.append("\n Texto 2 con append");
		texto.append("\n Texto 3 con append");
		texto.append("\n Texto  con append");
		/*-----------------------*/

	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		
	
		
		
	}

}
