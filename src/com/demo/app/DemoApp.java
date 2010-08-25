package com.demo.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button; 


public class DemoApp extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Button b = (Button) findViewById(R.id.Button01);
		b.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(DemoApp.this, com.pinkelstar.android.ui.PSSharing.class);
				intent.putExtra("developerMessage", "this is a custom developer message");
				intent.putExtra("contentUrl", "http://www.pinkelstar.com");
				startActivity(intent);
			}
		});
	}
	
}