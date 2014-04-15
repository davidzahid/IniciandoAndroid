package mx.zahid.iniciandroandroid;


import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.TextView;



public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		LinearLayout ll = (LinearLayout) findViewById(R.id.linearLayouttest);
	    //**************************//
		//envio de cadena de texto con propiedades al metodo print,
		//envia un resultado de operación --
		
		for(int i=0;  i<10; i++){
			/*una tabla del seno*/
			double x = i /10.0;
			double senodex =  Math.sin(x);
			print(ll,"\n Seno"+"("+x+")= "+senodex,15,255,255,0);
			
		}
	}
	
	//Se creo la función print (imprimir)
	public void print(LinearLayout ll, String texto, int size, int r,int g, int b){
		//propiedades del texto declaradas//
		TextView text = new TextView(this);
		text.setTextSize(size);
		text.setTextColor(Color.argb(255, r, g, b));
		//texto adicional a textView
		text.setText(texto);
		//envio de text a relative layout
		ll.addView(text);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		
	
		
		
	}

}
