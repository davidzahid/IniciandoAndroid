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
		//******Medoto Print()******//
		//a continuación se define un metodo print
		RelativeLayout rl = (RelativeLayout) findViewById(R.id.relativeLayouttest);
	    //**************************//
		//envio de cadena de texto con propiedades al metodo print
		print(rl, "\n Prueba 1",30,255,255,0);
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
