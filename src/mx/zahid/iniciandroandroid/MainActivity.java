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
		/*
		 * Variables declaradas de forma 
		 * local, para uso de operación 
		 * aritmetica*/
		double a=2.5;
		double b=1.25;
		double c=a+b;
		//******Medoto Print()******//
		//a continuación se define un metodo print
		RelativeLayout rl = (RelativeLayout) findViewById(R.id.relativeLayouttest);
	    //**************************//
		//envio de cadena de texto con propiedades al metodo print,
		//envia un resultado de operación --
		print(rl, "\n La suma de "+"a " + a + " + "+"b "+b+" es "+c,30,255,255,0);
	}
	
	//Se creo la función print (imprimir)
	public void print(RelativeLayout rl, String texto, int size, int r,int g, int b){
		//propiedades del texto declaradas//
		TextView text = new TextView(this);
		text.setTextSize(size);
		text.setTextColor(Color.argb(255, r, g, b));
		//texto adicional a textView
		text.setText(texto);
		//envio de text a relative layout
		rl.addView(text);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		
	
		
		
	}

}
