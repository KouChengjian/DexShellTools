package com.example.forceapkobj;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class SubActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
		setContentView(R.layout.activity_sub);
		
		Button bun = (Button) findViewById(R.id.bun);
		
		bun.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(SubActivity.this, "加油啊，伙计！", Toast.LENGTH_SHORT).show();
			}
		});
		
		Log.i("demo", "app:"+getApplicationContext());
		
	}

}
